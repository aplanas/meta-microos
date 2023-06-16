SUMMARY = "Graphical Boot Animation and Logger"
DESCRIPTION = "Plymouth provides an attractive graphical boot animation in \
place of the text messages that normally get shown. Text \
messages are instead redirected to a log file for viewing \
after boot."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-22.02.122+94.4bd41a3-5.1.aarch64.rpm"
RPM_HASH = "17f004fa45f59dc75d474d41f228e0e595be881f57c711d501317602c604a9552396b039ebbb6d97c719f8d6a03bb87df6ea90e97a838d879e01e00687228225"

RPROVIDES:${PN} += "bootsplash \
plymouth \
systemd-plymouth"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libm.so.6 \
libply-splash-core.so.5 \
libply.so.5 \
plymouth-branding \
plymouth-scripts \
systemd"

inherit rpm
