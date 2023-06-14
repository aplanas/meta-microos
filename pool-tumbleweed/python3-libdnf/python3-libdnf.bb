SUMMARY = "Python 3 bindings for the libdnf library"
DESCRIPTION = "This package provides the Python 3 bindings for the libdnf library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.1"

RPM_NAME = "python3-libdnf-0.70.1-1.1.aarch64.rpm"
RPM_HASH = "d964b7ac8f78f3a7a21af3ab8fd6a460288a77ea7f69c75ef053540558fa0121e144025db4193c61d5a70bf6d1fe25af19f41e1bd158e1e78a581df86147cbc5"

RPROVIDES:${PN} += "python3-libdnf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf.so.2 \
libdnf2 \
libgcc-s.so.1 \
libpython3.10.so.1.0 \
libsmartcols.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
