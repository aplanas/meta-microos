SUMMARY = "Module for reading and writing spatial data files"
DESCRIPTION = "Fiona is OGR's spatial data API for Python programmers."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "python39-Fiona-1.9.1-1.6.aarch64.rpm"
RPM_HASH = "9c8c0d2b00da4f66f549893b8d3a2313ae1e70afa07d5dd65d1ac6a22cd81a6fd23e29ea5d157ed1d6da1c5c9b5dfeee3d4e4554da69994cd66f0645a69809d6"

RPROVIDES:${PN} += "python3.9dist-fiona \
python39-Fiona \
python3dist-fiona"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.32 \
libstdc++.so.6 \
python-abi \
python39-attrs \
python39-click \
python39-click-plugins \
python39-cligj \
python39-munch \
python39-six"

inherit rpm
