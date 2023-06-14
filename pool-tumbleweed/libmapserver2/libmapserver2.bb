SUMMARY = "Mapsserver library for mapserver or mapscript module"
DESCRIPTION = "Mapserver library for mapserver or mapscript module. you need this lib to run mapserver \
or any of the mapscript module (php, java, python, ruby)"
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "libmapserver2-8.0.0-2.5.aarch64.rpm"
RPM_HASH = "2429e06adf262fb2af8b8900a8a91a34aec6ecb001b3d17b49199feea3e317c4b9c7bce28a70a2bca6fc66a4425e4f78b860624b253e58842e81668185c5f260"

RPROVIDES:${PN} += "libmapserver.so.2 \
libmapserver2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libexslt.so.0 \
libfreetype.so.6 \
libfribidi.so.0 \
libgcc-s.so.1 \
libgdal.so.32 \
libgeos-c.so.1 \
libgif.so.7 \
libharfbuzz.so.0 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libpq.so.5 \
libproj.so.25 \
libprotobuf-c.so.1 \
libstdc++.so.6 \
libxml2.so.2 \
libxslt.so.1"

inherit rpm
