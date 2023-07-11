SUMMARY = "Module for reading and writing spatial data files"
DESCRIPTION = "Fiona is OGR's spatial data API for Python programmers."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "python310-Fiona-1.9.1-1.6.aarch64.rpm"
RPM_HASH = "ae0873fdd45a03a42ef8700627be5789b82c9eddad6b9197f995a1fbffd83f10949d7c6e2b0d4229da30a27b2441b554f61be157d03af5da6a95f919329359db"

RPROVIDES:${PN} += "python3.10dist-fiona \
python310-Fiona \
python3dist-fiona"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.32 \
libstdc++.so.6 \
python-abi \
python310-attrs \
python310-click \
python310-click-plugins \
python310-cligj \
python310-munch \
python310-six"

inherit rpm
