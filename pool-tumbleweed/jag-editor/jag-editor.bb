SUMMARY = "Level Editor for the JAG game"
DESCRIPTION = "The aim of JAG is to break all of the target pieces on each level, \
and to do this before the time runs out. Keep doing this until you \
have beaten the last level and won the game. \
 \
This package contains the level editor for JAG."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.8"

RPM_NAME = "jag-editor-0.3.8-2.11.aarch64.rpm"
RPM_HASH = "4f3fa5c8b4e1a214c10e6695bb88687838dc73fd01219d1506ce654a612f72fde3d7fc14401992c045edc3c24cb9ecc6ba82983a91f3bc147c76d1a4ce61e32f"

RPROVIDES:${PN} += "application() \
application(jag-editor.desktop) \
jag-editor \
jag-editor(aarch-64) \
jag-level-editor"
RDEPENDS:${PN} += "jag \
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
