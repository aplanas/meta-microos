SUMMARY = "Godot headless binary for servers"
DESCRIPTION = "This package contains the headless binary for the Godot game engine \
particularly suited for running dedicated servers. This is branch 3.x with version specific file locations"
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "godot3-server-3.5.2-2.1.aarch64.rpm"
RPM_HASH = "66e9f31ab6160f9cbb394ef01fc8d6a77d393546f026d0f97be1ee702406409d866fa7d4f22ff2a24d2e67827564611d9a46efcf331f2312c1899fad35637098"

RPROVIDES:${PN} += "godot3-server \
godot3-server(aarch-64)"

RDEPENDS:${PN} += "ca-certificates \
ld-linux-aarch64.so.1()(64bit) \
libBulletCollision.so.3.17()(64bit) \
libBulletDynamics.so.3.17()(64bit) \
libBulletSoftBody.so.3.17()(64bit) \
libLinearMath.so.3.17()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libmbedcrypto.so.7()(64bit) \
libmbedtls.so.14()(64bit) \
libmbedx509.so.1()(64bit) \
libminiupnpc.so.17()(64bit) \
libogg.so.0()(64bit) \
libopus.so.0()(64bit) \
libopusfile.so.0()(64bit) \
libpcre2-32.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libsharpyuv.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtheora.so.0()(64bit) \
libtheoradec.so.1()(64bit) \
libvorbis.so.0()(64bit) \
libvorbisfile.so.3()(64bit) \
libwebp.so.7()(64bit) \
libwslay.so.0()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
