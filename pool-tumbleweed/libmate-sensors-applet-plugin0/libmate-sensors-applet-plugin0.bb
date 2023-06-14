SUMMARY = "MATE Desktop sensors applet shared libraries"
DESCRIPTION = "MATE Sensors Applet is an applet for the MATE Panel to display \
readings from hardware sensors, including CPU temperature, fan \
speeds and voltage readings under Linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "libmate-sensors-applet-plugin0-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "5f943454918eaca4d8ea021a40fb16b23d9e1438007056ee0d6cac446f4947ce19141cde34b334ebdf7761cc6221f67264a9e9304061dc6873f498df102008c9"

RPROVIDES:${PN} += "libmate-sensors-applet-plugin.so.0 \
libmate-sensors-applet-plugin0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
