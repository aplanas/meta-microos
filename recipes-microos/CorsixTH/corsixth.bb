SUMMARY = "Theme Hospital clone"
DESCRIPTION = "This project aims to reimplement the game engine of Theme Hospital, and be \
able to load the original game data files. This means that you will need a \
purchased copy of Theme Hospital, or a copy of the demo, in order to use \
CorsixTH. After most of the original engine has been reimplemented in open \
source code, the project will serve as a base from which extensions and \
improvements to the original game can be made."
LICENSE = "MIT"

PV = "0.66"

RPM_NAME = "CorsixTH-0.66-1.7.aarch64.rpm"
RPM_HASH = "50e340faa60c1f13ed052839982173ebf0e7c0cabb0353c39c26a154736840076d7c6173cc2b1c52fa406df1af83982061585af9918fafeece37ae061fdc613a"

RPROVIDES:${PN} += "CorsixTH CorsixTH(aarch-64) application() application(com.corsixth.corsixth.desktop) metainfo() metainfo(com.corsixth.corsixth.metainfo.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.10)(64bit) libSDL2_mixer-2.0.so.0()(64bit) libavcodec.so.60()(64bit) libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) libavformat.so.60()(64bit) libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) libavutil.so.58()(64bit) libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) liblua5.4.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libswresample.so.4()(64bit) libswresample.so.4(LIBSWRESAMPLE_4.10_SUSE)(64bit) libswscale.so.7()(64bit) libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit) lua-lpeg lua-luafilesystem"

inherit rpm
