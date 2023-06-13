SUMMARY = "Vacuum-IM notification messages through system DBus"
DESCRIPTION = "The plug-in uses org.freedesktop.Notifications for show of notification messages"
LICENSE = "GPL-3.0-only"

PV = "1.5.4"

RPM_NAME = "vacuum-im-plugins-dbusnotifications-1.5.4-1.24.aarch64.rpm"
RPM_HASH = "d9b6da810535157dbf76ea47d987ea3a45e0054d355d392b3ada3f91711561b61ae3e929930648c4ddf7f664012b5de0f41437957c2ea229b6a425c1f12ff5dd"

RPROVIDES:${PN} += "libdbusnotifications.so()(64bit) \
vacuum-im-plugins-dbusnotifications \
vacuum-im-plugins-dbusnotifications(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libvacuumutils.so.37()(64bit)"

inherit rpm
