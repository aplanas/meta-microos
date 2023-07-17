SUMMARY = "Widgets for configuration dialogs"
DESCRIPTION = "KConfigWidgets provides easy-to-use classes to create configuration dialogs, as \
well as a set of widgets which uses KConfig to store their settings."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5ConfigWidgets5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "7f5918763f6ccefe14434f5887b8fc989332f11962847d77292fc8f999fd6bcfa6309c1710f2692c8faca0bcc75e23e1b371491d6e7bd24668721bf27f9b2156"

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
