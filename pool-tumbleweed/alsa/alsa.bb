SUMMARY = "Advanced Linux Sound Architecture"
DESCRIPTION = "ALSA stands for Advanced Linux Sound Architecture.  It supports many \
PCI, ISA PnP  and USB sound cards. \
 \
This package contains the ALSA init scripts to start the sound system \
on your Linux box.  To set it up, run yast2 or alsaconf."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.9"

RPM_NAME = "alsa-1.2.9-1.1.aarch64.rpm"
RPM_HASH = "85992e646d2e3a77e531969aa1891de54fc48d7acdb23792705c56215a09a7d75f37c632e2ccbe4acb312199b6cfe5bdbcf559b925da82f744c8dcf4196d5d35"

RPROVIDES:${PN} += "alsa"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
alsa-ucm-conf \
alsa-utils \
fillup"

inherit rpm
