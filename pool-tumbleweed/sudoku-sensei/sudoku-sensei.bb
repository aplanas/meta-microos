SUMMARY = "Enjoy playing with Sudoku boards designed by yourself"
DESCRIPTION = "The engine solves sudokus by applying complex logical rules a few times, \
instead of applying simpler rules (like guessing and backtracking) \
many many times. These complex logical rules are exactly the same ones \
that people use with paper and pen."
LICENSE = "GPL-2.0-or-later"

PV = "02_00"

RPM_NAME = "sudoku-sensei-02_00-3.9.aarch64.rpm"
RPM_HASH = "969004d86749a1ce79cd0b2f06bc706cf816d2cd09b49e79d849d3b6b4cffc1b1230f9083456f5c8c82aa7f9639ef89054a69ac534eecd5a6e8d96cd9a316404"

RPROVIDES:${PN} += "application() \
application(sudoku-sensei.desktop) \
sudoku-sensei \
sudoku-sensei(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
