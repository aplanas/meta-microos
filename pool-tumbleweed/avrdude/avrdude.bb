SUMMARY = "Upload tool for AVR microcontrollers"
DESCRIPTION = "avrdude is a tool for AVR microcontrollers and drives many hardware \
in-system programmers. avrdude allows programming microcontrollers \
through a USB or parallel port of the computer."
LICENSE = "GPL-2.0-or-later"

PV = "7.1"

RPM_NAME = "avrdude-7.1-1.1.aarch64.rpm"
RPM_HASH = "b923ef2bcc8485789dd1c2abce06f1984bf37a98bc402f2d954a9f51adf3f8134adae41e321d088d8179f597252e725370e30fe530bafa53b40905683e0716ba"

RPROVIDES:${PN} += "avr-programmer \
avrdude"

RDEPENDS:${PN} += "/sbin/modprobe \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavrdude.so.1 \
libavrdude1 \
libc.so.6 \
libreadline.so.8"

inherit rpm
