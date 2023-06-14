SUMMARY = "KDE Character Selector"
DESCRIPTION = "KCharSelect is the KDE character selector tool."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kcharselect-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "555375d7a45c429cf4122dd3d1c6e09d02b95d129604dfc523c2e6a7ef31192ed4ce6da36e38711c781adb3c9d808f47de8cdc3b5e1701c152dc4d4610c9183b"

RPROVIDES:${PN} += "kcharselect \
kcharselect5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Bookmarks.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
