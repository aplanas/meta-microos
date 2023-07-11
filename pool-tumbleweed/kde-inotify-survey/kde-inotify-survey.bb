SUMMARY = "Monitor inotify limits and inform the user when they are reached"
DESCRIPTION = "Tooling for monitoring inotify limits and informing the user \
when they have been or are about to be reached."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kde-inotify-survey-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "a7e57aa3e0b350f9c0e2f1c79d09947a6868392916143969aded5a95621806868b737469826c39102f75b12ea5a94519bc54cf23e8d0868c43097fe0fb4ff48d"

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
