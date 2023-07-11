SUMMARY = "Instant replay solution for Linux"
DESCRIPTION = "This program will constantly record the screen without using too much \
computer resources and, at the press of a key combination, will save \
the last 30 seconds."
LICENSE = "GPL-3.0-only"

PV = "0.6.0"

RPM_NAME = "replay-sorcery-0.6.0-2.7.aarch64.rpm"
RPM_HASH = "82e569b31c2de2fa1c25f6582c967e47f6340a6914f38c1f79d90d4c39aebb7909fa96f9fc6d60be4eb9cc1c275c16aecc78fda97d61478094eee839339cece6"

RPROVIDES:${PN} += "replay-sorcery"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libavcodec.so.58.134 \
libavdevice.so.58.13 \
libavfilter.so.7.110 \
libavformat.so.58.76 \
libavutil.so.56.70 \
libc.so.6 \
libdrm.so.2 \
libgcc-s.so.1 \
libpulse.so.0 \
permissions \
systemd"

inherit rpm
