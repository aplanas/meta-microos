SUMMARY = "Mapsserver library for mapserver or mapscript module"
DESCRIPTION = "Mapserver library for mapserver or mapscript module. you need this lib to run mapserver \
or any of the mapscript module (php, java, python, ruby)"
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "libmapserver2-8.0.0-2.5.aarch64.rpm"
RPM_HASH = "2429e06adf262fb2af8b8900a8a91a34aec6ecb001b3d17b49199feea3e317c4b9c7bce28a70a2bca6fc66a4425e4f78b860624b253e58842e81668185c5f260"

RPROVIDES:${PN} += "libmapserver.so.2()(64bit) \
libmapserver2 \
libmapserver2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcurl.so.4()(64bit) \
libexslt.so.0()(64bit) \
libfreetype.so.6()(64bit) \
libfribidi.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgdal.so.32()(64bit) \
libgeos_c.so.1()(64bit) \
libgif.so.7()(64bit) \
libharfbuzz.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpq.so.5()(64bit) \
libproj.so.25()(64bit) \
libprotobuf-c.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit)"

inherit rpm
