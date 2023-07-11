SUMMARY = "Daemon listening for wall and write messages"
DESCRIPTION = "KDE daemon listening for wall and write messages."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "kwrited5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "ca2d897b81d9c99c6e2468d28814b055f95bf919f59985815ffbfc66ee833e4e31c84e4c4864961704aa472cd0e7d8d63c211b05ce07a017a5dc925157995a94"

RPROVIDES:${PN} += "kwrited5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5Notifications.so.5 \
libKF5Pty.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
