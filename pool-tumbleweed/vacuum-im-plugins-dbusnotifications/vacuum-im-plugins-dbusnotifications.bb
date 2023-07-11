SUMMARY = "Vacuum-IM notification messages through system DBus"
DESCRIPTION = "The plug-in uses org.freedesktop.Notifications for show of notification messages"
LICENSE = "GPL-3.0-only"

PV = "1.5.4"

RPM_NAME = "vacuum-im-plugins-dbusnotifications-1.5.4-1.25.aarch64.rpm"
RPM_HASH = "466486f76189094d05d60823b895af2bb8c3017ef5ee0fe09e901cfbfdf5e6c151b9f22b0a7cee68bb567e2dccaa7714634f1ed5a8dd723fa14e9a635670a273"

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
