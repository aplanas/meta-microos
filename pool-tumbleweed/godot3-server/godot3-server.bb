SUMMARY = "Godot headless binary for servers"
DESCRIPTION = "This package contains the headless binary for the Godot game engine \
particularly suited for running dedicated servers. This is branch 3.x with version specific file locations"
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "godot3-server-3.5.2-2.1.aarch64.rpm"
RPM_HASH = "66e9f31ab6160f9cbb394ef01fc8d6a77d393546f026d0f97be1ee702406409d866fa7d4f22ff2a24d2e67827564611d9a46efcf331f2312c1899fad35637098"

RPROVIDES:${PN} += "godot3-server"

RDEPENDS:${PN} += "ca-certificates \
ld-linux-aarch64.so.1 \
libBulletCollision.so.3.17 \
libBulletDynamics.so.3.17 \
libBulletSoftBody.so.3.17 \
libLinearMath.so.3.17 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmbedcrypto.so.7 \
libmbedtls.so.14 \
libmbedx509.so.1 \
libminiupnpc.so.17 \
libogg.so.0 \
libopus.so.0 \
libopusfile.so.0 \
libpcre2-32.so.0 \
libpng16.so.16 \
libsharpyuv.so.0 \
libstdc++.so.6 \
libtheora.so.0 \
libtheoradec.so.1 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libwebp.so.7 \
libwslay.so.0 \
libz.so.1 \
libzstd.so.1"

inherit rpm
