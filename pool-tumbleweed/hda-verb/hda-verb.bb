SUMMARY = "HD-audio jack retasking tool"
DESCRIPTION = "hda-verb is a small program to send HD-audio commands to the given \
ALSA hwdep device on the hd-audio interface."
LICENSE = "GPL-2.0-or-later"

PV = "0.4"

RPM_NAME = "hda-verb-0.4-24.4.aarch64.rpm"
RPM_HASH = "2f412028109e29f3cf592a7f740974e078e6c5b817caf1eeadd6001a3e81fc7ba61761960565e6ff6146115cdb3a46b526b2a89fe38856ac2ba7586617e67044"

RPROVIDES:${PN} += "alsa-tools-/usr/bin/hda-verb \
hda-verb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
