SUMMARY = "LeechCraft Azoth Spell Checker Module"
DESCRIPTION = "This package provides a spell checker plugin for LeechCraft Azoth. \
 \
It is based on Hunspell or Myspell dictionaries."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-rosenthal-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "788955045c34be8155bcdec941171c10ddf59aedcec73a57a2b16ff50f3e721f51b7bb36c8f9da30441816330532c3a41051fdd49a415185d015287c28488670"

RPROVIDES:${PN} += "leechcraft-azoth-rosenthal \
leechcraft-azoth-rosenthal(aarch-64) \
libleechcraft_azoth_rosenthal.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
leechcraft-azoth \
leechcraft-rosenthal \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm