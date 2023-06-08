SUMMARY = "Game engine made with pre-rendered background"
DESCRIPTION = "GemRB is an implementation of Bioware's Infinity Engine which was \
written to support pseudo-3D role playing games based on the \
Dungeons & Dragons ruleset. \
 \
You will need the original game files of Baldur's Gate and the Icewind \
Dale series or Planescape: Torment to play."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.1.1"

RPM_NAME = "gemrb-0.9.1.1-2.3.aarch64.rpm"
RPM_HASH = "749f97aa12e6e139b442f46af894c347be4c55c50386d6baf718c0f0588954597e6b80ff0469fad61f1170b622cb05b16574029104f75151996d6d12ceae144a"

RPROVIDES:${PN} += "application() application(gemrb.desktop) config(gemrb) gemrb gemrb(aarch-64) libgemrb_core.so.0.9.1()(64bit) metainfo() metainfo(org.gemrb.gemrb.metainfo.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) libSDL2-2.0.so.0(SUSE_2.0.6)(64bit) libSDL2-2.0.so.0(SUSE_2.0.9)(64bit) libSDL2_mixer-2.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libopenal.so.1()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libpython3.10.so.1.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libvlc.so.5()(64bit) libvorbisfile.so.3()(64bit) libz.so.1()(64bit)"

inherit rpm
