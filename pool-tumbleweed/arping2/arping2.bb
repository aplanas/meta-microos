SUMMARY = "Layer-2 Ethernet pinger"
DESCRIPTION = "Arping is a util to find out it a specific IP address on the LAN is \
'taken' and what MAC address owns it. It is designed to work on \
unrouted networks and with ICMP-blocking hosts."
LICENSE = "GPL-2.0-or-later"

PV = "2.23"

RPM_NAME = "arping2-2.23-1.5.aarch64.rpm"
RPM_HASH = "64a9745fcee5e80e55f13a5a742b36e679d455ea3cc3d258b7126d17dc6eaf8819b2d611222918a197c3f40f856c318a87f44b333de68dbebe2cde641f369ca9"

RPROVIDES:${PN} += "arping2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libnet.so.9 \
libpcap.so.1"

inherit rpm
