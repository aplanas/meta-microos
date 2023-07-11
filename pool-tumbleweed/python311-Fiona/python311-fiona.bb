SUMMARY = "Module for reading and writing spatial data files"
DESCRIPTION = "Fiona is OGR's spatial data API for Python programmers."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "python311-Fiona-1.9.1-1.6.aarch64.rpm"
RPM_HASH = "7d1434a4a7b2f674cb7357b2b0f9caba6dd08fb336757daff4901bb6bf8d149948e128955cdc68235bb9c4692e1295bf1375a2efd5a9a308341b27e064f6d1e7"

RPROVIDES:${PN} += "python3-Fiona \
python3.11dist-fiona \
python311-Fiona \
python3dist-fiona"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.32 \
libstdc++.so.6 \
python-abi \
python311-attrs \
python311-click \
python311-click-plugins \
python311-cligj \
python311-munch \
python311-six"

inherit rpm
