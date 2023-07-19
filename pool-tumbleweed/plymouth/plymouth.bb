SUMMARY = "Graphical Boot Animation and Logger"
DESCRIPTION = "Plymouth provides an attractive graphical boot animation in \
place of the text messages that normally get shown. Text \
messages are instead redirected to a log file for viewing \
after boot."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-22.02.122+94.4bd41a3-6.1.aarch64.rpm"
RPM_HASH = "84dba9c40bd7227e36b8935a7df0f9f21bb080567a5c00b3707458e2352d19ee590b36ae220852010a4bbcdc2cf3e808a91f0d781cfefb232a3545eaf340ade5"

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
