SUMMARY = "Cross-Platform Game Engine with an Integrated Editor"
DESCRIPTION = "Godot is a game engine. It provides a set of tools and a visually \
oriented workflow that can export games to PC, Mobile and Web \
platforms. This is branch 3.x with version specific file locations"
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "godot3-3.5.2-2.2.aarch64.rpm"
RPM_HASH = "bb4d7bb599ef65bc0c41d96ac7bd526f301991eeaab3f71d12ec6e6d6ecf73a6b467e3da07cbea4510d0ffc39d902424b450232b77335bb1892dfc7ce399653e"

RPROVIDES:${PN} += "bundled-FastLZ \
bundled-RVO2-3D \
bundled-Tangent-Space-Normal-Maps \
bundled-brotli \
bundled-cvtt \
bundled-embree \
bundled-enet \
bundled-etc2comp \
bundled-glad \
bundled-google-droid-fonts \
bundled-hack-fonts \
bundled-hqx \
bundled-ifaddrs-android \
bundled-jpeg-compressor \
bundled-libsimplewebm \
bundled-minimp3 \
bundled-minizip \
bundled-nanosvg \
bundled-noto-sans-fonts \
bundled-oidn \
bundled-open-simplex-noise-in-c \
bundled-pcg \
bundled-polyclipping \
bundled-polypartition \
bundled-pvrtccompressor \
bundled-recastnavigation \
bundled-smaz \
bundled-squish \
bundled-stb \
bundled-tinyexr \
bundled-vhacd \
bundled-xatlas \
bundled-yuv2rgb \
godot3"

RDEPENDS:${PN} += "ca-certificates \
ld-linux-aarch64.so.1 \
libBulletCollision.so.3.17 \
libBulletDynamics.so.3.17 \
libBulletSoftBody.so.3.17 \
libGL.so.1 \
libLinearMath.so.3.17 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
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
libzstd.so.1 \
update-desktop-files"

inherit rpm
