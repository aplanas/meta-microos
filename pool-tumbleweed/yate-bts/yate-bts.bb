SUMMARY = "GSM BTS based on Yet Another Telephony Engine"
DESCRIPTION = "Yate is a telephony engine designed to implement PBX and IVR solutions \
for small to large scale projects. \
This module implements a 2G GSM BTS for Yate. \
At least one transceiver package must also be installed for \
interfacing with the hardware."
LICENSE = "GPL-2.0-or-later & AGPL-3.0-only"

PV = "6.1.0"

RPM_NAME = "yate-bts-6.1.0-2.11.aarch64.rpm"
RPM_HASH = "332304281b1949693769bf435d25b307dafc90b1b05a9b1dc166ec14437780e91097c9ec2d5ce446b61cc8eeebf1efca2c58f86f46084ad2e77e365ea879c1dd"

RPROVIDES:${PN} += "config-yate-bts \
yate-bts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/php \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libyate.so.6.4.0 \
libyateradio.so.6.4.0 \
yate-scripts"

inherit rpm
