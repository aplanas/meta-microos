SUMMARY = "A real-time strategy game of ancient warfare"
DESCRIPTION = "0 A.D. (pronounced 'zero ey-dee') is a real-time strategy (RTS) game \
of ancient warfare. It is a historically-based war/economy game that \
allows players to relive or rewrite the history of Western \
civilizations, focusing on the years between 500 B.C. and 500 A.D. \
The project contains 3D graphics, detailed artwork, sound, and a \
flexible game engine."
LICENSE = "BSD-3-Clause & CC-BY-SA-3.0 & GPL-2.0-or-later & LGPL-3.0-or-later & MIT & ISC & MPL-2.0"

PV = "0.0.26"

RPM_NAME = "0ad-0.0.26-2.3.aarch64.rpm"
RPM_HASH = "e3efb696dea0b471e18433837a7927d1a69150e3177b1b34dfcead596fc51bb6bd8d01779bc8941653c0a9b2ef572bb5bc8dc1932a7504f4fbf2042c459c5ba1"

RPROVIDES:${PN} += "0ad \
0ad(aarch-64) \
application() \
application(0ad.desktop) \
libAtlasUI.so()(64bit) \
libCollada.so()(64bit) \
metainfo() \
metainfo(0ad.appdata.xml) \
mimehandler(application/x-pyromod+zip)"

RDEPENDS:${PN} += "/bin/sh \
0ad-data \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.24.0)(64bit) \
libX11.so.6()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libenet.so.7()(64bit) \
libfmt.so.9()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libgloox.so.18()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libminiupnpc.so.17()(64bit) \
libmozjs-78.so.0()(64bit) \
libmozjs-78.so.0(mozjs_78)(64bit) \
libopenal.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libsodium.so.23()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libvorbisfile.so.3()(64bit) \
libwx_baseu-suse-nostl.so.3.0.5()(64bit) \
libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0)(64bit) \
libwx_baseu_xml-suse-nostl.so.3.0.5()(64bit) \
libwx_baseu_xml-suse-nostl.so.3.0.5(WXU_3.0)(64bit) \
libwx_gtk2u_core-suse-nostl.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse-nostl.so.3.0.5(WXU_3.0)(64bit) \
libwx_gtk2u_gl-suse-nostl.so.3.0.5()(64bit) \
libwx_gtk2u_gl-suse-nostl.so.3.0.5(WXU_3.0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.2)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.21)(64bit) \
libxml2.so.2(LIBXML2_2.9.0)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
