SUMMARY = "Convergent RSS/Atom feed reader"
DESCRIPTION = "Alligator is a convergent RSS/Atom feed reader."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "alligator-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "6dc178afe6f579d858e85d177f341955837dd0708517c6237d3b215adcfd6792ef73cb423b13b30224341529e6c4b4a290fa2dd99871af771c8c80322b8d178b"

RPROVIDES:${PN} += "alligator alligator(aarch-64) application() application(org.kde.alligator.desktop) metainfo() metainfo(org.kde.alligator.appdata.xml)"
RDEPENDS:${PN} += "kirigami-addons kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Syndication.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
