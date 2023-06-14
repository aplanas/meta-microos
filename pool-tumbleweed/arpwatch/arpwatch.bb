SUMMARY = "Tool to keep track of Ethernet<->IP address pairings"
DESCRIPTION = "Arpwatch keeps track of Ethernet and IP address pairings. It logs \
activity to syslog and reports certain changes via e-mail."
LICENSE = "BSD-3-Clause"

PV = "3.3"

RPM_NAME = "arpwatch-3.3-2.2.aarch64.rpm"
RPM_HASH = "12bdabf3a9cac0d23486358e66fae6ffb79060c571d12ded43b5320b4cb0f9dadeddb9325c0c505fe365b192e47699ac8a61f68711ca5560c47b4f501cf2ce1a"

RPROVIDES:${PN} += "arpwatch"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
arpwatch-ethercodes \
coreutils \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1 \
libresolv.so.2"

inherit rpm
