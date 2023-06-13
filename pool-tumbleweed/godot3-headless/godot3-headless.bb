SUMMARY = "Headless version of Godot editor useful for command line"
DESCRIPTION = "This package is the headless version of the Godot editor that is suited for \
exporting Godot games on the command line. This is branch 3.x with version specific file locations"
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "godot3-headless-3.5.2-2.1.aarch64.rpm"
RPM_HASH = "9df844b74a38f03cce6b1e9ac60c88203bdd1e5ab20f6570e99bc3c23eb249413de574e618a808897a832c1c0872556c7a5dafa4a2fb8e8ef14f0b8fcf56278b"

RPROVIDES:${PN} += "godot3-headless \
godot3-headless(aarch-64)"

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
