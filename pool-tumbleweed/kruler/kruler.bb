SUMMARY = "Screen Ruler"
DESCRIPTION = "A screen ruler for the Plasma desktop environment"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kruler-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "1c9c1adebd05d891db278d8a285b6b4a013f33f8f498b34deb8f6eedc592bc2b8c336803dffc5ea5e77f1adaed7d67cdc72e92b0fb4d60ead8eb426bb0082194"

RPROVIDES:${PN} += "kruler \
kruler5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
