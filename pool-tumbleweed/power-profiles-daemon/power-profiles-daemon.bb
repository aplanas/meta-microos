SUMMARY = "Power profiles handling over D-Bus"
DESCRIPTION = "power-profiles-daemon offers to modify system behaviour based upon user-selected \
power profiles. There are 3 different power profiles: a 'balanced' default mode, \
a 'power-saver' mode, and a 'performance' mode."
LICENSE = "GPL-3.0-or-later"

PV = "0.13"

RPM_NAME = "power-profiles-daemon-0.13-1.1.aarch64.rpm"
RPM_HASH = "6a6a49bb93d056ced3530d2a089d37f0ef152b808bacf852d8225eafe1c369698856f68cb6c52d783dc9115c945769bf3869931d5e7cd0d79e42c6af43bf8b4d"

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
