SUMMARY = "GUI to edit quests for the Solarus engine"
DESCRIPTION = "Solarus Quest Editor is a graphical user interface to create and \
modify quests for the Solarus engine."
LICENSE = "GPL-3.0-or-later & CC-BY-SA-3.0"

PV = "1.6.2"

RPM_NAME = "solarus-quest-editor-1.6.2-2.1.aarch64.rpm"
RPM_HASH = "4d2c1d77097c5202766d3fed84c18e46a0f14a9305211595d6dd3cc0a0c7ebd0d8c63b1d89ef083b9721779229e185824da944f3ec2c4950540892770ed2b7b0"

RPROVIDES:${PN} += "application() \
application(solarus-quest-editor.desktop) \
solarus-quest-editor \
solarus-quest-editor(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libluajit-5.1.so.2()(64bit) \
libsolarus-gui.so()(64bit) \
libsolarus.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
solarus-quest-editor-assets"

inherit rpm
