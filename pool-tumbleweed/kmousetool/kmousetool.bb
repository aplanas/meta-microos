SUMMARY = "Automatic Mouse Click"
DESCRIPTION = "Clicks the mouse for you, reducing hand strain."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kmousetool-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "c6b546cbd6e14612d98f8964d804875c059858d0513de77b13a45b899c0daa8a12c0384f59396373441d793dc12e74b96b053e213f4642456ee99f5b2162243f"

RPROVIDES:${PN} += "application() \
application(org.kde.kmousetool.desktop) \
kmousetool \
kmousetool(aarch-64) \
kmousetool5 \
metainfo() \
metainfo(org.kde.kmousetool.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libphonon4qt5.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
