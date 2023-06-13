SUMMARY = "Wordcount graphing program"
DESCRIPTION = "NovProg allows you to create a graph of your progress in writing a \
NaNoWriMo style novel. You enter your wordcount and it updates a graph \
showing you how much progress you have made. It also shows you how far you \
are through your daily goal, and your total goal. Mousing over a bar in the \
graph will show a tooltip with that day's wordcount."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.0"

RPM_NAME = "novprog-3.2.0-1.8.aarch64.rpm"
RPM_HASH = "127d10a3e4d20778f413dcffcbf853bc38c4ecf13d52893b4781e1c64ab9b2fdcc71e7ae831644cc71f5538e4abb076379c471fb88d683e8c378bf4dc7a585c6"

RPROVIDES:${PN} += "application() \
application(novprog.desktop) \
metainfo() \
metainfo(novprog.appdata.xml) \
novprog \
novprog(aarch-64)"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
