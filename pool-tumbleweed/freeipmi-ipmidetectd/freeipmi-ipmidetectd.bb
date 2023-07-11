SUMMARY = "IPMI node detection monitoring daemon"
DESCRIPTION = "This service detects and monitors IPMI nodes."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.11"

RPM_NAME = "freeipmi-ipmidetectd-1.6.11-1.1.aarch64.rpm"
RPM_HASH = "ec5563d0fcae2a99bf04dcb8c6ec2d5bb4860321a3c166856f92ad8ce6a93e9f8e9002a4b5bafeb909f92b528ce980b64766b0fdfa95001df9d27fe6b531f88e"

RPROVIDES:${PN} += "config-freeipmi-ipmidetectd \
freeipmi-ipmidetectd"

RDEPENDS:${PN} += "/usr/bin/sh \
freeipmi \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreeipmi.so.17 \
systemd"

inherit rpm
