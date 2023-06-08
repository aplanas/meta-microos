SUMMARY = "Terminal emulator which mimics old screens"
DESCRIPTION = "cool-retro-term is a terminal emulator which tries to mimic the look and feel \
of the old cathode tube screens. It has been designed to be eye-candy, \
customizable, and reasonably lightweight."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "cool-retro-term-1.2.0-1.5.aarch64.rpm"
RPM_HASH = "274f40c126080914330761e0a1b04bf08cb682bfd7e624151eaf9303e9545f6a660f4aacd91db4f07b754531018ffe6865c45a6f49562e7cf0b6ccdf8b7e64e5"

RPROVIDES:${PN} += "application() application(cool-retro-term.desktop) cool-retro-term cool-retro-term(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libqt5-qtgraphicaleffects libqt5-qtquickcontrols2 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) qmltermwidget"

inherit rpm
