SUMMARY = "Cross-Platform Game Engine with an Integrated Editor"
DESCRIPTION = "Godot is a game engine. It provides a set of tools and a visually \
oriented workflow that can export games to PC, Mobile and Web \
platforms."
LICENSE = "MIT"

PV = "4.0.3"

RPM_NAME = "godot-4.0.3-1.1.aarch64.rpm"
RPM_HASH = "d56bee6c0f223155fb133b10662d7ee6ffc47bff9367b385b19b4078c6123c498b8bc15d321a513aec2a1b39b05cf610b1ac33ecfc7eec9f158633124f3fbb15"

RPROVIDES:${PN} += "application() \
application(org.godotengine.Godot.desktop) \
bundled(FastLZ) \
bundled(FastNoiseLite) \
bundled(JetBrainsMono_Regular) \
bundled(RVO2-3D) \
bundled(Tangent_Space_Normal_Maps) \
bundled(amd-fsr) \
bundled(astcenc) \
bundled(basis_universal) \
bundled(brotli) \
bundled(cvtt) \
bundled(doctest) \
bundled(embree) \
bundled(enet) \
bundled(etcpak) \
bundled(glad) \
bundled(google-droid-fonts) \
bundled(hqx) \
bundled(icu4c) \
bundled(ifaddrs-android) \
bundled(jpeg-compressor) \
bundled(meshoptimizer) \
bundled(minimp3) \
bundled(minizip) \
bundled(msdfgen) \
bundled(noto-sans-fonts) \
bundled(oidn) \
bundled(openxr) \
bundled(pcg) \
bundled(polyclipping) \
bundled(polypartition) \
bundled(pvrtccompressor) \
bundled(recastnavigation) \
bundled(smaz) \
bundled(spirv-reflect) \
bundled(squish) \
bundled(stb) \
bundled(thorvg) \
bundled(tinyexr) \
bundled(vhacd) \
bundled(volk) \
bundled(vulkan) \
bundled(xatlas) \
bundled(yuv2rgb) \
godot \
godot(aarch-64) \
metainfo() \
metainfo(org.godotengine.Godot.appdata.xml) \
mimehandler(application/x-godot-project)"
RDEPENDS:${PN} += "ca-certificates \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSPIRV.so.12()(64bit) \
libX11.so.6()(64bit) \
libXcursor.so.1()(64bit) \
libXext.so.6()(64bit) \
libXi.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXrender.so.1()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libglslang.so.12()(64bit) \
libgraphite2.so.3()(64bit) \
libharfbuzz-icu.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmbedcrypto.so.7()(64bit) \
libmbedtls.so.14()(64bit) \
libmbedx509.so.1()(64bit) \
libminiupnpc.so.17()(64bit) \
libogg.so.0()(64bit) \
libpcre2-32.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libsharpyuv.so.0()(64bit) \
libspeechd.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtheora.so.0()(64bit) \
libtheoradec.so.1()(64bit) \
libtheoradec.so.1(libtheoradec_1.0)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libvorbis.so.0()(64bit) \
libvorbisfile.so.3()(64bit) \
libwebp.so.7()(64bit) \
libwslay.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit) \
libxkbcommon.so.0(V_0.8.0)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
libzstd.so.1()(64bit) \
update-desktop-files"

inherit rpm
