SUMMARY = "Userspace utility to access the nf_tables packet filter"
DESCRIPTION = "nf_tables is a firewalling mechanism in the Linux kernel, running \
independently of and parallel to ip_tables, ip6_tables, \
arp_tables and ebtables. nftables is the corresponsing userspace \
frontend. \
 \
The nftables frontend features support for sets and dictionaries of arbitrary \
types, meta data types, atomic incremental and full ruleset updates, and, \
similar to iptables, support for different protocols, access to connection \
tracking and NAT and logging."
LICENSE = "GPL-2.0-only"

PV = "1.0.7"

RPM_NAME = "nftables-1.0.7-1.7.aarch64.rpm"
RPM_HASH = "36692e7000773d26fe1e1ba4a333383baaac1e6293fec1730033e6493ceee6b9c367cfdbeb9e1b1d40177413e827777a11c732a8620dec22cede82a74db6b4c9"

RPROVIDES:${PN} += "nftables"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
libnftables.so.1"

inherit rpm
