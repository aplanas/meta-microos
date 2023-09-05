SUMMARY = "Timer for various types of tea"
DESCRIPTION = "Timer utility by KDE where the user can select a particular type of tea, \
and be reminded when the associated hardcoded time is over."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kteatime-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "f9ddc670d18a3b40075b21d59ee846685d1be23447d8f2f310b79be7cc48406b31f3b0a4454302d3b127b4cbc2811b8ab9e84ba9a6b54d8318f937ea1d50969c"

RPROVIDES:${PN} += "kteatime \
kteatime5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5TextWidgets.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
