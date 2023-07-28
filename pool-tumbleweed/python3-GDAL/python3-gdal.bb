SUMMARY = "GDAL Python3 module"
DESCRIPTION = "The GDAL python modules provide support to handle multiple GIS file formats."
LICENSE = "BSD-3-Clause & MIT & SUSE-Public-Domain"

PV = "3.6.3"

RPM_NAME = "python3-GDAL-3.6.3-2.6.aarch64.rpm"
RPM_HASH = "cb981a18a0934450937f8e1946cd75d3850f4b1fb6aa065a46f4d03ebd06c0e5bcd2263784c0634820a66c0ba1e2d7eec73911ac3f11721a5c451d5c8ed551fd"

RPROVIDES:${PN} += "python3-GDAL \
python3-gdal \
python3.11dist-gdal \
python3dist-gdal"

RDEPENDS:${PN} += "gdal \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.32 \
libstdc++.so.6 \
python-abi"

inherit rpm
