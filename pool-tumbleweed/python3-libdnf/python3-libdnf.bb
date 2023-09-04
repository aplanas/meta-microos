SUMMARY = "Python 3 bindings for the libdnf library"
DESCRIPTION = "This package provides the Python 3 bindings for the libdnf library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.2"

RPM_NAME = "python3-libdnf-0.70.2-1.1.aarch64.rpm"
RPM_HASH = "4f4eb0e1999eaf40ae62b07b9abe8bcada8538c32070c61593323702ebc661f62cbc02e6c903d38898f8cec5f908728b1215a02b9c1169d613ddbd316eb62c67"

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
