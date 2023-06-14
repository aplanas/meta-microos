SUMMARY = "KDE System Guard daemon"
DESCRIPTION = "This package contains the ksysguard daemon and application. \
 \
This package can be installed on servers without any other KDE packages \
to enable monitoring them remotely with ksysguard."
LICENSE = "GPL-2.0-only"

PV = "5.22.0"

RPM_NAME = "ksysguard5-5.22.0-3.4.aarch64.rpm"
RPM_HASH = "e68236c2d918c21697b0f573a2ea80387ac6a7fe4455c14f9f835dfdc86bf422cf775dda95069c5e593e3e04623eba148fdef2668b5080e15eabca50a8d5272f"

RPROVIDES:${PN} += "config-ksysguard5 \
kdebase4-workspace-ksysguardd \
ksysguard5"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NewStuff.so.5 \
libKF5NewStuffCore.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKSysGuardFormatter.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libksgrd.so.9 \
libksignalplotter.so.9 \
libksysguard5-plugins \
libm.so.6 \
libprocesscore.so.9 \
libprocessui.so.9 \
libsensors.so.4 \
libstdc++.so.6"

inherit rpm
