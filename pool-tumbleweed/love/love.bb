SUMMARY = "2D gaming engine written in Lua"
DESCRIPTION = "LÖVE is a framework for making 2D games in Lua."
LICENSE = "Zlib"

PV = "11.4"

RPM_NAME = "love-11.4-2.5.aarch64.rpm"
RPM_HASH = "5d6e0969c369433117392d88976e9fd66bb5471b02a2f95ee45c0c96b33af98fe9bef52454b7f640d072f36da2756ab00b8a1d0ea439152c368e3d856666fdd4"

RPROVIDES:${PN} += "application() \
application(love.desktop) \
liblove-11.4.so()(64bit) \
love \
love(aarch-64) \
mimehandler(application/x-love-game)"

RDEPENDS:${PN} += "/bin/sh \
desktop-file-utils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.18)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.6)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.7)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.9)(64bit) \
libSDL2-2.0.so.0(SUSE_2.24.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libluajit-5.1.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmodplug.so.1()(64bit) \
libmpg123.so.0()(64bit) \
libogg.so.0()(64bit) \
libopenal.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtheoradec.so.1()(64bit) \
libtheoradec.so.1(libtheoradec_1.0)(64bit) \
libvorbisfile.so.3()(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
shared-mime-info"

inherit rpm
