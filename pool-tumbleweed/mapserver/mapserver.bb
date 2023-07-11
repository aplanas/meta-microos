SUMMARY = "Environment for building spatially-enabled internet applications"
DESCRIPTION = "Mapserver is an internet mapping program that converts GIS data to \
map images in real time. With appropriate interface pages, \
Mapserver can provide an interactive internet map based on \
custom GIS data."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "mapserver-8.0.0-2.7.aarch64.rpm"
RPM_HASH = "239cf5cd047435792d3c493b2d5a0d66170efa190b725ae1a17c5338aaaa6cea485d4b5088f035bac3f676161107a9cae9a8e13a33edb53c5bbe6823db74e233"

RPROVIDES:${PN} += "mapserver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfcgi.so.0 \
libmapserver.so.2 \
libmapserver2 \
proj"

inherit rpm
