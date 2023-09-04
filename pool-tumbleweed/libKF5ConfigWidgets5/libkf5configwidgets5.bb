SUMMARY = "Widgets for configuration dialogs"
DESCRIPTION = "KConfigWidgets provides easy-to-use classes to create configuration dialogs, as \
well as a set of widgets which uses KConfig to store their settings."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5ConfigWidgets5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "c7781d20ffc54213d17dacb123a1e3fed3bdfd5d231078a579c8b0f2c0dd36e6b5988e95c991058ccdc78282f0b81c9fbb02c4b8a2fa2d2d646814a4082fa988"

RPROVIDES:${PN} += "libKF5ConfigWidgets.so.5 \
libKF5ConfigWidgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5AuthCore.so.5 \
libKF5Codecs.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
