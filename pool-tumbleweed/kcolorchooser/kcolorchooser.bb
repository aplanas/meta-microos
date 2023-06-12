SUMMARY = "Color Chooser"
DESCRIPTION = "This is an color chooser application by KDE."
LICENSE = "MIT"

PV = "23.04.1"

RPM_NAME = "kcolorchooser-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "c9c350ed30d7ed1299e63870898b43b9b20965837026edb1315c5997e8baf74913d61dffb5dacb171dc870e15a120c2a8c70be70f51a4849873d2941055783df"

RPROVIDES:${PN} += "application() \
application(org.kde.kcolorchooser.desktop) \
kcolorchooser \
kcolorchooser(aarch-64) \
metainfo() \
metainfo(org.kde.kcolorchooser.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit)"

inherit rpm
