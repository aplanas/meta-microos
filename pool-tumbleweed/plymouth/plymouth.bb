SUMMARY = "Graphical Boot Animation and Logger"
DESCRIPTION = "Plymouth provides an attractive graphical boot animation in \
place of the text messages that normally get shown. Text \
messages are instead redirected to a log file for viewing \
after boot."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-22.02.122+94.4bd41a3-10.1.aarch64.rpm"
RPM_HASH = "275a690403fe7ea0003bf906a486a5e24b6f57afdf46b1ad2cf4d6e14baf8642a9f5a15af279564125635d2bdced2c21057edb3aaa869866865f2cc63388b583"

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
