SUMMARY = "Classic snake game on the terminal"
DESCRIPTION = "nsnake is a clone of the classic snake game that we all used to play on our \
cellphones. You play this game on the terminal, with textual interface. \
 \
Here are some features: \
 \
- Customizable gameplay, appearance and keybindings \
- Neat GUI-like interface with nice animations \
- Lots of possible game modes, with scores saved for eac"
LICENSE = "GPL-3.0-only"

PV = "3.0.1"

RPM_NAME = "nsnake-3.0.1-2.16.aarch64.rpm"
RPM_HASH = "76b071b6b7b75fe2446c14b37e78d272990c8f7454a7d78bd5a95c69c8fce525e8d3cfdc2d6750870a6733d6a40c125b9733b9d1981f939f49313290cd0a242c"

RPROVIDES:${PN} += "application() \
application(nsnake.desktop) \
nsnake \
nsnake(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
