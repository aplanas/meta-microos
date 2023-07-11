SUMMARY = "Tool to keep track of Ethernet<->IP address pairings"
DESCRIPTION = "Arpwatch keeps track of Ethernet and IP address pairings. It logs \
activity to syslog and reports certain changes via e-mail."
LICENSE = "BSD-3-Clause"

PV = "3.3"

RPM_NAME = "arpwatch-3.3-2.3.aarch64.rpm"
RPM_HASH = "eeca958712af387e61c51904f4c29011e14b639dcebbd9f7fb92ec2d74785ddb1be8e7a6e142c584d1439d6984b124f708c19955d09c67df3c2a77781b4dea78"

RPROVIDES:${PN} += "arpwatch"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
arpwatch-ethercodes \
coreutils \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1 \
libresolv.so.2"

inherit rpm
