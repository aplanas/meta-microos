SUMMARY = "A libpcap-based Ethernet packet generator"
DESCRIPTION = "Bit-Twist is a libpcap-based Ethernet packet generator complementing \
tcpdump. It replays traffic captured in .pcap files onto a live \
network. It comes with a trace file editor to allow you to change the \
contents of a trace file. \
 \
A packet generator is useful in simulating networking traffic or \
testing firewall, IDS, and IPS, and troubleshooting various network \
problems."
LICENSE = "GPL-2.0"

PV = "2.0"

RPM_NAME = "bittwist-2.0-2.24.aarch64.rpm"
RPM_HASH = "3ba3510f44b3e1cba36c7c273f001e7b97978af740711a5034a1786d0e9130b99363be33ef144cb7c3aae5ce5beae8cdbacf2452bb1a0e82bda0b9bdc049dfe6"

RPROVIDES:${PN} += "bittwist \
bittwist(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpcap.so.1()(64bit)"

inherit rpm
