SUMMARY = "Pronunciation Self-Teaching"
DESCRIPTION = "Improve your pronunciation by listening to native speakers."
LICENSE = "LGPL-3.0-or-later & GPL-2.0-only & BSD-3-Clause"

PV = "23.04.1"

RPM_NAME = "artikulate-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "3a01266c25d73bd48f150bd5eff832e2c942cc4decf7cb8bcc7ac3b7ee13bf728c3619aeda47453aff5bd621ccaa6c1238154b58ac320b50d32a7151d9f2fa5e"

RPROVIDES:${PN} += "application() application(org.kde.artikulate.desktop) artikulate artikulate(aarch-64) artikulate5 libartikulatecore.so.0()(64bit) libartikulatelearnerprofile.so.0()(64bit) libartikulatesound.so.0()(64bit) metainfo() metainfo(org.kde.artikulate.appdata.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig kirigami2 knewstuff-imports kqtquickcharts ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libQt5XmlPatterns.so.5()(64bit) libQt5XmlPatterns.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libqt5-qtquickcontrols libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
