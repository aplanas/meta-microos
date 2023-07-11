SUMMARY = "Kea DHCP Dynamic DNS library"
DESCRIPTION = "This is a library of classes for sending and receiving requests used \
by ISC's DHCP-DDNS (aka D2) service to carry out DHCP-driven DNS \
updates."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-dhcp_ddns29-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "0de5c140a8fcb654572080c996ef682cc22ff3328e5ae83ddb21de50c636e83b2ee0c153fc3c27c487735e9c753488821b71e4db0ebe0ca90b148469b845e1be"

RPROVIDES:${PN} += "libkea-dhcp-ddns.so.29 \
libkea-dhcp-ddns29"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.40 \
libkea-cc.so.39 \
libkea-cryptolink.so.28 \
libkea-dhcp++.so.54 \
libkea-dns++.so.30 \
libkea-exceptions.so.13 \
libkea-log.so.35 \
libkea-stats.so.18 \
libkea-util.so.52 \
libstdc++.so.6"

inherit rpm
