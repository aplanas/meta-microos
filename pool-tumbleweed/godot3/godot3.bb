SUMMARY = "Cross-Platform Game Engine with an Integrated Editor"
DESCRIPTION = "Godot is a game engine. It provides a set of tools and a visually \
oriented workflow that can export games to PC, Mobile and Web \
platforms. This is branch 3.x with version specific file locations"
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "godot3-3.5.2-2.1.aarch64.rpm"
RPM_HASH = "9c20710b1e5a5c994e512f2840d46c4842abf3b7842469929ee655abf0372218852cc6876f0aaf808dc35b1df2de949e36e4a06505ed78f2f22b1856576eab5a"

RPROVIDES:${PN} += "application() \
application(org.godotengine.Godot3.desktop) \
bundled(FastLZ) \
bundled(RVO2-3D) \
bundled(Tangent_Space_Normal_Maps) \
bundled(brotli) \
bundled(cvtt) \
bundled(embree) \
bundled(enet) \
bundled(etc2comp) \
bundled(glad) \
bundled(google-droid-fonts) \
bundled(hack-fonts) \
bundled(hqx) \
bundled(ifaddrs-android) \
bundled(jpeg-compressor) \
bundled(libsimplewebm) \
bundled(minimp3) \
bundled(minizip) \
bundled(nanosvg) \
bundled(noto-sans-fonts) \
bundled(oidn) \
bundled(open-simplex-noise-in-c) \
bundled(pcg) \
bundled(polyclipping) \
bundled(polypartition) \
bundled(pvrtccompressor) \
bundled(recastnavigation) \
bundled(smaz) \
bundled(squish) \
bundled(stb) \
bundled(tinyexr) \
bundled(vhacd) \
bundled(xatlas) \
bundled(yuv2rgb) \
godot3 \
godot3(aarch-64) \
metainfo() \
metainfo(org.godotengine.Godot3.appdata.xml) \
mimehandler(application/x-godot-project)"

RDEPENDS:${PN} += "ca-certificates \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
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
libc.so.6(GLIBC_2.34)(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
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
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtheora.so.0()(64bit) \
libtheoradec.so.1()(64bit) \
libtheoradec.so.1(libtheoradec_1.0)(64bit) \
libvorbis.so.0()(64bit) \
libvorbisfile.so.3()(64bit) \
libwebp.so.7()(64bit) \
libwslay.so.0()(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
libzstd.so.1()(64bit) \
update-desktop-files"

inherit rpm
