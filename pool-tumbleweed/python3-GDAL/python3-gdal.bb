SUMMARY = "GDAL Python3 module"
DESCRIPTION = "The GDAL python modules provide support to handle multiple GIS file formats."
LICENSE = "BSD-3-Clause & MIT & SUSE-Public-Domain"

PV = "3.6.3"

RPM_NAME = "python3-GDAL-3.6.3-2.4.aarch64.rpm"
RPM_HASH = "cb067492e180aa9850528c4287583cbd63328f3baaf84050c2c16f15db550a8a0ae2de13d6fdbdc4ff711ba64a9b18d847bdf3fdc1c5e8470a376c7a59f75c32"

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
