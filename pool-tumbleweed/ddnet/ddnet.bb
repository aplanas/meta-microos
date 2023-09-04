SUMMARY = "DDraceNetwork, a cooperative racing mod of Teeworlds"
DESCRIPTION = "DDraceNetwork (DDNet) is an actively maintained version of DDRace, \
a Teeworlds modification with a unique cooperative gameplay. \
Help each other play through custom maps with up to 64 players, \
compete against the best in international tournaments, design your \
own maps, or run your own server."
LICENSE = "Apache-2.0 & CC-BY-SA-3.0 & Zlib & MIT & SUSE-Public-Domain"

PV = "17.2"

RPM_NAME = "ddnet-17.2-1.1.aarch64.rpm"
RPM_HASH = "be4f44b8bc7bd011cd247cdb32eaafa69d5bff56ca920f1e83e87bc5e0b0edd4c42257ab5620997307586e954c5a34fa78b878a6bd64f67159c23dc24261ee80"

RPROVIDES:${PN} += "ddnet \
libantibot.so"

RDEPENDS:${PN} += "ddnet-data \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.2 \
libSDL2-2.0.so.0 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libm.so.6 \
libnotify.so.4 \
libopusfile.so.0 \
libpng16.so.16 \
libsqlite3.so.0 \
libstdc++.so.6 \
libvulkan.so.1 \
libwavpack.so.1 \
libz.so.1"

inherit rpm
