SUMMARY = "Advanced Linux Sound Architecture"
DESCRIPTION = "ALSA stands for Advanced Linux Sound Architecture.  It supports many \
PCI, ISA PnP  and USB sound cards. \
 \
This package contains the ALSA init scripts to start the sound system \
on your Linux box.  To set it up, run yast2 or alsaconf."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.10"

RPM_NAME = "alsa-1.2.10-1.1.aarch64.rpm"
RPM_HASH = "c2bc989ebf8773412df4a64d89bc08cd1c41a1990c4653adf8be8ecda4ed9e4b3f2194ebc5a3997d20674fca6afcffccf8fbefc1bc7f1ab78ca9ca52538ffce9"

RPROVIDES:${PN} += "alsa"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
alsa-ucm-conf \
alsa-utils \
fillup"

inherit rpm
