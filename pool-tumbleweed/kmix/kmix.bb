SUMMARY = "Sound Mixer"
DESCRIPTION = "KMix is a fully featured audio mixer by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kmix-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "8150c9de81a502c1c15ea39fb400f600ca00d47882c670a3448092fd0647901b3204357e206a9cd297df19c355e6e3ddda7c12c59f316eac5f75a252e5dedf5f"

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
