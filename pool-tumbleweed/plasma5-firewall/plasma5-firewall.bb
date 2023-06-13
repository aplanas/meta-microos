SUMMARY = "Config Module for the System Firewall"
DESCRIPTION = "Config Module for the System Firewall"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "plasma5-firewall-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "7e635bf0d2b9daecb1b9c50856aaf563bbfad18579a97975641430da84920f5c33e46dfd675c61961fcdbc357274c89121f78dc740f6b59e9a49a194e4eef886"

RPROVIDES:${PN} += "application() \
application(kcm_firewall.desktop) \
libkcm_firewall_core.so()(64bit) \
metainfo() \
metainfo(org.kde.plasma.firewall.metainfo.xml) \
plasma5-firewall \
plasma5-firewall(aarch-64)"

RDEPENDS:${PN} += "firewalld \
kdeclarative-components \
kirigami2 \
kitemmodels-imports \
knewstuff-imports \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5QuickAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libqt5-qtquickcontrols \
libqt5-qtquickcontrols2 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt5qmlimport(QtQml.2) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(org.kde.kcm.1) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.kitemmodels.1)"

inherit rpm
