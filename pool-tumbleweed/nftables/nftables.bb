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

PV = "1.0.8"

RPM_NAME = "nftables-1.0.8-1.1.aarch64.rpm"
RPM_HASH = "88b164cd228c7ed7a5eb588d508b9fbcf4b0d0035639cbed66a7fef4d97a2c67ee2ef8c9c3244e80f3a14880ff5ad7965f4158d9dc6877231aa07553c9803d96"

RPROVIDES:${PN} += "nftables"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
libnftables.so.1"

inherit rpm
