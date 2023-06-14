SUMMARY = "Screen Ruler"
DESCRIPTION = "A screen ruler for the Plasma desktop environment"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kruler-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "25219f0258775bea2f34ab7214ae60b178b58c2230b9601aaf26fa178f647687cd1ba110ab72e4c8f112b90367a76fb5cc15bb6c10a27de984e2703f26d7cd8c"

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
