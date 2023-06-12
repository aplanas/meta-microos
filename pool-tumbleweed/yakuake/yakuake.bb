SUMMARY = "Drop-down terminal emulator based on Konsole technologies"
DESCRIPTION = "Yakuake is a Drop-down terminal emulator based on Konsole technologies."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "yakuake-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "84ee4250ea270e9de23515b2ba9c1da7c672dd91e8273dc825c2d9af073765ae8ffa31ec8fd512445c05ee7f59f6df482dbb00d4e150374ebbe5b984125307b1"

RPROVIDES:${PN} += "application() \
application(org.kde.yakuake.desktop) \
metainfo() \
metainfo(org.kde.yakuake.appdata.xml) \
yakuake \
yakuake(aarch-64)"
RDEPENDS:${PN} += "konsole-part \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5GlobalAccel.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5NewStuff.so.5()(64bit) \
libKF5NewStuffCore.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5NotifyConfig.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5WaylandClient.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm