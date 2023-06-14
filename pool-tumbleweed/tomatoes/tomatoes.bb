SUMMARY = "How many tomatoes can you smash in ten short minutes?"
DESCRIPTION = "I Have No Tomatoes is an extreme leisure time activity idea of which \
culminates in the following question: How many tomatoes can you smash \
in ten short minutes? If you have the time to spare, this game has the \
vegetables just waiting to beeliminated!"
LICENSE = "Zlib"

PV = "1.55"

RPM_NAME = "tomatoes-1.55-2.23.aarch64.rpm"
RPM_HASH = "666992dfe17e296cb4e059d26d956dec71ca512ec24695e50997d91e5c9d9f793d3b362a4cd56507631c0902de372b9af9525599c2d4edd7a8f41c99ea27b730"

RPROVIDES:${PN} += "config-tomatoes \
tomatoes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
