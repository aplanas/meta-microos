SUMMARY = "Timer for various types of tea"
DESCRIPTION = "Timer utility by KDE where the user can select a particular type of tea, \
and be reminded when the associated hardcoded time is over."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kteatime-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "8e4828177d093592681b66b720e12230041ca87914f4c59c7cfe7e27836f9f7e25386adc4c355aa21809b6f9236ea93ae0105b272e790efff5aa0937452e37c4"

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
