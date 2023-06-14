SUMMARY = "Network injection and capture"
DESCRIPTION = "Packit (Packet toolkit) is a network auditing tool. It \
can customize, inject, monitor, and manipulate IP traffic. \
By being able to construct nearly all TCP, UDP, ICMP, IP, ARP, \
RARP, and Ethernet header options, Packit can be useful in testing \
firewalls, intrusion detection/prevention systems, port scanning, \
simulating network traffic, and general TCP/IP auditing."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.1"

RPM_NAME = "packit-1.8.1-1.2.aarch64.rpm"
RPM_HASH = "5aa04e45bfa3870f33afb2bb00396e1e951386d7f8c7c4b4b5a3eae3d15555c41a975d3468394fff43d740c15ed2a253b631adb0d67ffafdd98ab752a87a806b"

RPROVIDES:${PN} += "packit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnet.so.9 \
libpcap.so.1"

inherit rpm
