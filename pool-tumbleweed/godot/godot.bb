SUMMARY = "Cross-Platform Game Engine with an Integrated Editor"
DESCRIPTION = "Godot is a game engine. It provides a set of tools and a visually \
oriented workflow that can export games to PC, Mobile and Web \
platforms."
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "godot-4.1.1-1.1.aarch64.rpm"
RPM_HASH = "d818fdc49e1590b433615f897940040c591b0760555c84f25f95a327bd786c737029f9a440737d268c663c24793cc154bc7b3393d74ba5397886c184ee20915b"

RPROVIDES:${PN} += "bundled-FastLZ \
bundled-FastNoiseLite \
bundled-JetBrainsMono-Regular \
bundled-RVO2-3D \
bundled-Tangent-Space-Normal-Maps \
bundled-amd-fsr \
bundled-astcenc \
bundled-basis-universal \
bundled-cvtt \
bundled-doctest \
bundled-embree \
bundled-enet \
bundled-etcpak \
bundled-glad \
bundled-google-droid-fonts \
bundled-hqx \
bundled-icu4c \
bundled-ifaddrs-android \
bundled-jpeg-compressor \
bundled-meshoptimizer \
bundled-minimp3 \
bundled-minizip \
bundled-msdfgen \
bundled-noto-sans-fonts \
bundled-nvapi \
bundled-oidn \
bundled-openxr \
bundled-pcg \
bundled-polyclipping \
bundled-polypartition \
bundled-pvrtccompressor \
bundled-recastnavigation \
bundled-smaz \
bundled-spirv-reflect \
bundled-squish \
bundled-stb \
bundled-thorvg \
bundled-tinyexr \
bundled-vhacd \
bundled-volk \
bundled-vulkan \
bundled-xatlas \
bundled-yuv2rgb \
godot"

RDEPENDS:${PN} += "ca-certificates \
ld-linux-aarch64.so.1 \
libSPIRV.so.12 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libasound.so.2 \
libbrotlicommon.so.1 \
libbrotlidec.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libglslang.so.12 \
libgraphite2.so.3 \
libharfbuzz-icu.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libmbedcrypto.so.7 \
libmbedtls.so.14 \
libmbedx509.so.1 \
libminiupnpc.so.17 \
libogg.so.0 \
libpcre2-32.so.0 \
libpng16.so.16 \
libpulse.so.0 \
libspeechd.so.2 \
libstdc++.so.6 \
libtheora.so.0 \
libtheoradec.so.1 \
libudev.so.1 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libwebp.so.7 \
libwslay.so.0 \
libxkbcommon.so.0 \
libz.so.1 \
libzstd.so.1 \
update-desktop-files"

inherit rpm
