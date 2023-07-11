SUMMARY = "Mapsserver library for mapserver or mapscript module"
DESCRIPTION = "Mapserver library for mapserver or mapscript module. you need this lib to run mapserver \
or any of the mapscript module (php, java, python, ruby)"
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "libmapserver2-8.0.0-2.7.aarch64.rpm"
RPM_HASH = "a7edfdd40d0098b2f4ca3599d7520df01185b5a17ef766f1486834da952d29eef531ca8e20e84fec77d02bfc476f76e39b0a4e8a2215cfbf183d5f38281a2505"

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
