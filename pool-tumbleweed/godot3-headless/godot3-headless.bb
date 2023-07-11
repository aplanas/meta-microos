SUMMARY = "Headless version of Godot editor useful for command line"
DESCRIPTION = "This package is the headless version of the Godot editor that is suited for \
exporting Godot games on the command line. This is branch 3.x with version specific file locations"
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "godot3-headless-3.5.2-2.2.aarch64.rpm"
RPM_HASH = "d0e2cb1d37808f6720792e067ab30c2017a75e01a15157be81d2c89de0bf77e72a324c20c6b6ce94ae92d74b179c44fcd0f8db9b6403a5cd668396b1c3ca7627"

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
