SUMMARY = "Standalone client for the Quassel IRC client"
DESCRIPTION = "Quassel IRC is a distributed IRC client, meaning that one (or \
multiple) client(s) can attach to and detach from a central core -- \
much like the combination of GNU Screen and a text-based IRC client \
such as WeeChat, but graphical. \
 \
This is the quassel standalone client."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "quassel-mono-0.14.0-1.5.aarch64.rpm"
RPM_HASH = "19dea08181a14f8a386a02b248a4b74aedb9a1223bba35068b720df8d01f77d7b11a29d925bce0a558f48dcf7e9294dce8a96fe7a4abb5df888b592ace2edcad"

RPROVIDES:${PN} += "application() \
application(quassel.desktop) \
quassel \
quassel-mono \
quassel-mono(aarch-64) \
quassel_ui"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5NotifyConfig.so.5()(64bit) \
libKF5SonnetUi.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbusmenu-qt5.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libqca-qt5.so.2()(64bit) \
libqt5_sql_backend \
libsnore-qt5.so.0.7()(64bit) \
libsnoresettings-qt5.so.0.7()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit) \
quassel-base"

inherit rpm
