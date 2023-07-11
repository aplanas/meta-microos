SUMMARY = "How many tomatoes can you smash in ten short minutes?"
DESCRIPTION = "I Have No Tomatoes is an extreme leisure time activity idea of which \
culminates in the following question: How many tomatoes can you smash \
in ten short minutes? If you have the time to spare, this game has the \
vegetables just waiting to beeliminated!"
LICENSE = "Zlib"

PV = "1.55"

RPM_NAME = "tomatoes-1.55-2.24.aarch64.rpm"
RPM_HASH = "8872878d528c51ae066575f10db79f3ccbce7ad7a2dc5e9c0fd6ab10caa79530800d08b8146203409dbc38db27ed97a9171ec75d1fe19a54733ea1bc644c2158"

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
