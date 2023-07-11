SUMMARY = "A libpcap-based Ethernet packet generator"
DESCRIPTION = "Bit-Twist is a libpcap-based Ethernet packet generator complementing \
tcpdump. It replays traffic captured in .pcap files onto a live \
network. It comes with a trace file editor to allow you to change the \
contents of a trace file. \
 \
A packet generator is useful in simulating networking traffic or \
testing firewall, IDS, and IPS, and troubleshooting various network \
problems."
LICENSE = "GPL-2.0-only"

PV = "3.7"

RPM_NAME = "bittwist-3.7-1.1.aarch64.rpm"
RPM_HASH = "42d65b40012cf91c61b6aa5fbff8f94ec3c7082457555b397b45ad69814d7a63f3e6897eaec584847c4c9accc32c7ea7c979788d01a8730e233c6d359561ac4a"

RPROVIDES:${PN} += "bittwist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1"

inherit rpm
