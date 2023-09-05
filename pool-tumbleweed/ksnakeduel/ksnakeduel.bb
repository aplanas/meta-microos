SUMMARY = "Simple snake duel game"
DESCRIPTION = "KSnakeDuel is a simple snake duel game"
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "ksnakeduel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "496596047ff6aa428b2320d0b003c2d3f815678a346c794618d0394dcfbfdafee3ac75a394ccc80bf03c1b82e7060ba64a0fbef9a76e9b0fa997da07ee0f8a3b"

RPROVIDES:${PN} += "ksnakeduel \
ksnakeduel5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
