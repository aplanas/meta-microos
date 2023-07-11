SUMMARY = "DDraceNetwork, a cooperative racing mod of Teeworlds"
DESCRIPTION = "DDraceNetwork (DDNet) is an actively maintained version of DDRace, \
a Teeworlds modification with a unique cooperative gameplay. \
Help each other play through custom maps with up to 64 players, \
compete against the best in international tournaments, design your \
own maps, or run your own server."
LICENSE = "Apache-2.0 & CC-BY-SA-3.0 & Zlib & MIT & SUSE-Public-Domain"

PV = "16.9"

RPM_NAME = "ddnet-16.9-1.3.aarch64.rpm"
RPM_HASH = "80638bc047daa9690fc266fb0a04fd13749e87b0e3e974cefd0d85d9fc4998df3a792e868ca3dc81b9a9565c4d8f7390642cd504e713c1140e163e6702705aa6"

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
