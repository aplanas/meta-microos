SUMMARY = "TCP/IP Packet Injection Suite"
DESCRIPTION = "A commandline-based IP stack for Linux. The suite is broken down by \
protocol and allows for scripting of injected packet streams from \
shell scripts. \
 \
Key features: \
 * support for ARP, DNS, ICMP, IGMP, OSPF, RIP, TCP, UDP protocols \
 * layer 2 or layer 3 injection \
 * packet payload from file"
LICENSE = "BSD-4-Clause"

PV = "1.8"

RPM_NAME = "nemesis-1.8-1.7.aarch64.rpm"
RPM_HASH = "56cd3d4741db96169925b0dffe2ef77dff86a9cbdc4f8616a15a6ed104df9f2488c80ca56a6d545f24170f926db9ee3044b8a45a32ab2c37aba9dcb9c4400afb"

RPROVIDES:${PN} += "nemesis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libnet.so.9"

inherit rpm
