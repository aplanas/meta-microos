SUMMARY = "Shared binary to play games developed with the Godot engine"
DESCRIPTION = "This package contains a godot-runner binary for the Linux X11 platform, \
which can be used to run any game developed with the Godot engine simply \
by pointing to the location of the game's data package. This is branch 3.x with version specific file locations"
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "godot3-runner-3.5.2-2.1.aarch64.rpm"
RPM_HASH = "a58855c5ea59a2bd521a03a1f42add18685db6f835a2679ff8e35b7d86e873e61622045f5dbe1982e5ea9dd87b109f7f48ccf6071d9c8f95cf29ec0cd6647de6"

RPROVIDES:${PN} += "godot3-runner \
godot3-runner(aarch-64)"

RDEPENDS:${PN} += "ca-certificates \
ld-linux-aarch64.so.1()(64bit) \
libBulletCollision.so.3.17()(64bit) \
libBulletDynamics.so.3.17()(64bit) \
libBulletSoftBody.so.3.17()(64bit) \
libGL.so.1()(64bit) \
libLinearMath.so.3.17()(64bit) \
libX11.so.6()(64bit) \
libXcursor.so.1()(64bit) \
libXext.so.6()(64bit) \
libXi.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXrender.so.1()(64bit) \
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
