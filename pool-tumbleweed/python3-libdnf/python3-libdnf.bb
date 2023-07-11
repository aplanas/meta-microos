SUMMARY = "Python 3 bindings for the libdnf library"
DESCRIPTION = "This package provides the Python 3 bindings for the libdnf library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.1"

RPM_NAME = "python3-libdnf-0.70.1-1.2.aarch64.rpm"
RPM_HASH = "e86eb845ba86b496390a0373fea6011dc96895149f49e264855b95996faa1dd60b8fd1d95fe52b7f141a6122a4b8412b6ff14e4aaa659eaa98c828cfd2587bff"

RPROVIDES:${PN} += "python3-libdnf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf.so.2 \
libdnf2 \
libgcc-s.so.1 \
libpython3.11.so.1.0 \
libsmartcols.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
