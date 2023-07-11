SUMMARY = "Precision Time Protocol v2 daemon"
DESCRIPTION = "This software is an implementation of the Precision Time Protocol (PTP) \
according to the IEEE1588 standard for Linux."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.1"

RPM_NAME = "linuxptp-3.1.1-2.9.aarch64.rpm"
RPM_HASH = "671208ae2c2ddb8c8d7cd28bba074c0ee54b8981ab89621dfb2598d63559087b4464f1654f5788462fcd6880c7305f85d622399b0e426c8fc0715b5a3bc424fb"

RPROVIDES:${PN} += "config-linuxptp \
linuxptp \
ptp-timekeeping"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
systemd"

inherit rpm
