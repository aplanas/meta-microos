SUMMARY = "HD-audio jack retasking tool"
DESCRIPTION = "hda-verb is a small program to send HD-audio commands to the given \
ALSA hwdep device on the hd-audio interface."
LICENSE = "GPL-2.0-or-later"

PV = "0.4"

RPM_NAME = "hda-verb-0.4-24.3.aarch64.rpm"
RPM_HASH = "40ba2a04fb50fc1e67c46599faa236328e5d4ec5f1387b2e7964c6c87b3cab0ec5e34bd458f35a0902a5fe56e69437453f927181c3463f7c9b10c72d9111b1d2"

RPROVIDES:${PN} += "alsa-tools:/usr/bin/hda-verb \
hda-verb \
hda-verb(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
