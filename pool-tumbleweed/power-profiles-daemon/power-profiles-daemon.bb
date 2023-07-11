SUMMARY = "Power profiles handling over D-Bus"
DESCRIPTION = "power-profiles-daemon offers to modify system behaviour based upon user-selected \
power profiles. There are 3 different power profiles: a 'balanced' default mode, \
a 'power-saver' mode, and a 'performance' mode."
LICENSE = "GPL-3.0-or-later"

PV = "0.13"

RPM_NAME = "power-profiles-daemon-0.13-1.2.aarch64.rpm"
RPM_HASH = "112468631a140feb105a1e80163d34bff8198468dc7f2bec9397af340d07f19196b5234fc8bb200a7e65683f5e229547da67f3695b694a3ee9363ae505104e19"

RPROVIDES:${PN} += "power-profiles-daemon"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libpolkit-gobject-1.so.0 \
polkit"

inherit rpm
