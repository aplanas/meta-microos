SUMMARY = "Monitor inotify limits and inform the user when they are reached"
DESCRIPTION = "Tooling for monitoring inotify limits and informing the user \
when they have been or are about to be reached."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kde-inotify-survey-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "2156206a3835395d973ba6431c544b06ae8671117cddf74254a78cecf30037fd7c87b2ec327769eb21f1077d575da2fe882a456efd7afa178055391f6287296c"

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
