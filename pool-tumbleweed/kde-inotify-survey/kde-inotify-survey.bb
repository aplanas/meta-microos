SUMMARY = "Monitor inotify limits and inform the user when they are reached"
DESCRIPTION = "Tooling for monitoring inotify limits and informing the user \
when they have been or are about to be reached."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kde-inotify-survey-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "93d592bb0e670cb8dd3ee3cc339057113cc11f25780bf76d317a6dd2740385dfc6555dc1dc40c70deb955e155b1be0e5e69a916266ea963e5a58328ef91556ee"

RPROVIDES:${PN} += "kde-inotify-survey"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5AuthCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
