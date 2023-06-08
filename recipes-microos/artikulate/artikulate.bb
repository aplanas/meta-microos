SUMMARY = "Pronunciation Self-Teaching"
DESCRIPTION = "Improve your pronunciation by listening to native speakers."
LICENSE = "LGPL-3.0-or-later & GPL-2.0-only & BSD-3-Clause"

PV = "23.04.0"

RPM_NAME = "artikulate-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "0eea722be01559da41bdf16eabae035281c4f2ad13f41ef7c0fbc1773a8960616982b15ed9c0a831f01fe9efab983fb0927e31a1ae4aff7b52a99e3b27a3d318"

RPROVIDES:${PN} += "application() application(org.kde.artikulate.desktop) artikulate artikulate(aarch-64) artikulate5 libartikulatecore.so.0()(64bit) libartikulatelearnerprofile.so.0()(64bit) libartikulatesound.so.0()(64bit) metainfo() metainfo(org.kde.artikulate.appdata.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig kirigami2 knewstuff-imports kqtquickcharts ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libQt5XmlPatterns.so.5()(64bit) libQt5XmlPatterns.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libqt5-qtquickcontrols libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
