SUMMARY = "Graphical Boot Animation and Logger"
DESCRIPTION = "Plymouth provides an attractive graphical boot animation in \
place of the text messages that normally get shown. Text \
messages are instead redirected to a log file for viewing \
after boot."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-22.02.122+94.4bd41a3-9.1.aarch64.rpm"
RPM_HASH = "e37176c9c3becb30a3252e7c279b04cbe4c0592f30e1a72c45b71a4172779f972e2c3018889660dc45f94fb8b94066947b0158c9733986910c7ea182e4c348a7"

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
