SUMMARY = "KDE System Guard daemon"
DESCRIPTION = "This package contains the ksysguard daemon and application. \
 \
This package can be installed on servers without any other KDE packages \
to enable monitoring them remotely with ksysguard."
LICENSE = "GPL-2.0-only"

PV = "5.22.0"

RPM_NAME = "ksysguard5-5.22.0-3.4.aarch64.rpm"
RPM_HASH = "e68236c2d918c21697b0f573a2ea80387ac6a7fe4455c14f9f835dfdc86bf422cf775dda95069c5e593e3e04623eba148fdef2668b5080e15eabca50a8d5272f"

RPROVIDES:${PN} += "application() \
application(org.kde.ksysguard.desktop) \
config(ksysguard5) \
kdebase4-workspace-ksysguardd \
ksysguard5 \
ksysguard5(aarch-64) \
metainfo() \
metainfo(org.kde.ksysguard.appdata.xml) \
mimehandler(application/x-ksysguard)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5NewStuff.so.5()(64bit) \
libKF5NewStuffCore.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKSysGuardFormatter.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libksgrd.so.9()(64bit) \
libksignalplotter.so.9()(64bit) \
libksysguard5-plugins \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libprocesscore.so.9()(64bit) \
libprocessui.so.9()(64bit) \
libsensors.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
