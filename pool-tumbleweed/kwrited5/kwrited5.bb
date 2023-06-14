SUMMARY = "Daemon listening for wall and write messages"
DESCRIPTION = "KDE daemon listening for wall and write messages."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "kwrited5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "f6d42581f6a35cf2049d58910b69a3fd6711ff03e25834f28d267e1f0257abb46df1c5f1a8406dca28b32287fab7789d6cd27ce8583880d85da42c99c02a4a77"

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
