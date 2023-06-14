SUMMARY = "Environment for building spatially-enabled internet applications"
DESCRIPTION = "Mapserver is an internet mapping program that converts GIS data to \
map images in real time. With appropriate interface pages, \
Mapserver can provide an interactive internet map based on \
custom GIS data."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "mapserver-8.0.0-2.5.aarch64.rpm"
RPM_HASH = "22b6d992a874b601552ecc5ee1018680cca06b73a41c343ee0346a2d6859b41fca0a0d345eb47868f932ed6f14eaedbce8cbf485c8c51d8b2a7579e0f4af1a40"

RPROVIDES:${PN} += "mapserver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfcgi.so.0 \
libmapserver.so.2 \
libmapserver2 \
proj"

inherit rpm
