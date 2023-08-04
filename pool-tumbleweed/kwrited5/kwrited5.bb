SUMMARY = "Daemon listening for wall and write messages"
DESCRIPTION = "KDE daemon listening for wall and write messages."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "kwrited5-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "92ec869a3400935611523308d3b9b82de2f17af60d38692ebe2fc131281589f4f934063807a02d8b3c1a1d945e314d03879cefb68a1b464aeef4f7f31aa70db0"

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
