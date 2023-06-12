SUMMARY = "Convergent RSS/Atom feed reader"
DESCRIPTION = "Alligator is a convergent RSS/Atom feed reader."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "alligator-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "114845a7f626aee7a09c898b792433b7c9420981b62c2b65f6d3f1e8ccdc4fbc2125e0bacb90e9a43661ccbe23f312fadbce25b5108f317e9003dd962cd9b221"

RPROVIDES:${PN} += "alligator \
alligator(aarch-64) \
application() \
application(org.kde.alligator.desktop) \
metainfo() \
metainfo(org.kde.alligator.appdata.xml)"
RDEPENDS:${PN} += "kirigami-addons \
kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5Syndication.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
