SUMMARY = "Drop-down terminal emulator based on Konsole technologies"
DESCRIPTION = "Yakuake is a Drop-down terminal emulator based on Konsole technologies."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "yakuake-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "84ee4250ea270e9de23515b2ba9c1da7c672dd91e8273dc825c2d9af073765ae8ffa31ec8fd512445c05ee7f59f6df482dbb00d4e150374ebbe5b984125307b1"

RPROVIDES:${PN} += "yakuake"

RDEPENDS:${PN} += "konsole-part \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOCore.so.5 \
libKF5NewStuff.so.5 \
libKF5NewStuffCore.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5WaylandClient.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
