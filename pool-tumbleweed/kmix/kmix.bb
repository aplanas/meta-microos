SUMMARY = "Sound Mixer"
DESCRIPTION = "KMix is a fully featured audio mixer by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kmix-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "a2edc0a5d4d072cfd0d86c8cb6bb81c8da6305fe4bb9526c6b16c7e143dc6152c584bf6e0fe9abf8c5c3ade2c2a2d5146d92502a223e4096b647979824033ccd"

RPROVIDES:${PN} += "config-kmix \
kmix \
kmix5 \
libkmixcore.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5Solid.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libasound.so.2 \
libc.so.6 \
libcanberra.so.0 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
