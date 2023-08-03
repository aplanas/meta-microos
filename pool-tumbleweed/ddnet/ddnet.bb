SUMMARY = "DDraceNetwork, a cooperative racing mod of Teeworlds"
DESCRIPTION = "DDraceNetwork (DDNet) is an actively maintained version of DDRace, \
a Teeworlds modification with a unique cooperative gameplay. \
Help each other play through custom maps with up to 64 players, \
compete against the best in international tournaments, design your \
own maps, or run your own server."
LICENSE = "Apache-2.0 & CC-BY-SA-3.0 & Zlib & MIT & SUSE-Public-Domain"

PV = "17.1.1"

RPM_NAME = "ddnet-17.1.1-1.1.aarch64.rpm"
RPM_HASH = "ebe10d5ccb0c1586b758bc6352e71b6d211de9365afef5d68a9b694ada4915e35a3ed06c97ae194797449224aaede7fdbd5be178a85bf6c72f3e43d7dc62bb18"

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
