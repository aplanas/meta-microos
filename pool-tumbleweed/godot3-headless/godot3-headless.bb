SUMMARY = "Headless version of Godot editor useful for command line"
DESCRIPTION = "This package is the headless version of the Godot editor that is suited for \
exporting Godot games on the command line. This is branch 3.x with version specific file locations"
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "godot3-headless-3.5.2-2.1.aarch64.rpm"
RPM_HASH = "9df844b74a38f03cce6b1e9ac60c88203bdd1e5ab20f6570e99bc3c23eb249413de574e618a808897a832c1c0872556c7a5dafa4a2fb8e8ef14f0b8fcf56278b"

RPROVIDES:${PN} += "godot3-headless"

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
