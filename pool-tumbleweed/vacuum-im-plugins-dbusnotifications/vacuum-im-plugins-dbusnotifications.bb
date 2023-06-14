SUMMARY = "Vacuum-IM notification messages through system DBus"
DESCRIPTION = "The plug-in uses org.freedesktop.Notifications for show of notification messages"
LICENSE = "GPL-3.0-only"

PV = "1.5.4"

RPM_NAME = "vacuum-im-plugins-dbusnotifications-1.5.4-1.24.aarch64.rpm"
RPM_HASH = "d9b6da810535157dbf76ea47d987ea3a45e0054d355d392b3ada3f91711561b61ae3e929930648c4ddf7f664012b5de0f41437957c2ea229b6a425c1f12ff5dd"

RPROVIDES:${PN} += "libdbusnotifications.so \
vacuum-im-plugins-dbusnotifications"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvacuumutils.so.37"

inherit rpm
