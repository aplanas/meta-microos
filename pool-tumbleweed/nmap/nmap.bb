SUMMARY = "Network exploration tool and security scanner"
DESCRIPTION = "Nmap ('Network Mapper') is a utility for network exploration or \
security auditing. It may as well be used for tasks such as network \
inventory, managing service upgrade schedules, and monitoring host or \
service uptime. Nmap uses raw IP packets to determine what hosts are \
available on the network, what services (application name and \
version) those hosts are offering, what operating systems (and OS \
versions) they are running, what type of packet filters/firewalls are \
in use, and dozens of other characteristics. It scans large networks, \
and works fine against single hosts."
LICENSE = "GPL-2.0-or-later"

PV = "7.93"

RPM_NAME = "nmap-7.93-1.3.aarch64.rpm"
RPM_HASH = "2e864f318859587fd40e2019d7bd70764f2a6b88d7d846495c224c641951f78f146ba899cc55265e79434978e5e772305c1948aaacb8f799c1d3f239b2ba5423"

RPROVIDES:${PN} += "nmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
liblua5.3.so.5 \
libm.so.6 \
libpcap.so.1 \
libpcre.so.1 \
libssh2.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
