SUMMARY = "Timer for various types of tea"
DESCRIPTION = "Timer utility by KDE where the user can select a particular type of tea, \
and be reminded when the associated hardcoded time is over."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kteatime-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f7036028b57b4db1b4205c5f2d51f90da4f2d1541f88371ebeb85985b3399a49ac002d0b1c602ff9eba3fb1f95cde056ffa73c11434433165b99c4d354b72cb1"

RPROVIDES:${PN} += "kteatime \
kteatime5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
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
