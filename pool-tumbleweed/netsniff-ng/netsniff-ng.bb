SUMMARY = "Network Sniffer for Packet Inspection"
DESCRIPTION = "netsniff-ng is a network sniffer for packet inspection. It is similar \
to tcpdump, and likewise uses a memory mapped area for accessing \
packets. It can be used for protocol analysis and reverse \
engineering, network debugging, measurement of performance \
throughput, or network statistics creation of incoming packets on \
central network nodes like routers or firewalls. \
 \
The netsniff-ng toolkit consists of the following utilities: \
 \
* netsniff-ng, a zero-copy analyzer, pcap capturing and replaying tool \
* trafgen, a multithreaded low-level zero-copy network packet generator \
* mausezahn, high-level packet generator for HW/SW appliances with Cisco-CLI \
* bpfc, a Berkeley Packet Filter compiler, Linux BPF JIT disassembler \
* ifpps, a top-like kernel networking statistics tool \
* flowtop, a top-like netfilter connection tracking tool \
* curvetun, a curve25519-based IP tunnel \
* astraceroute, an autonomous system (AS) trace route utility"
LICENSE = "GPL-2.0-only"

PV = "0.6.8"

RPM_NAME = "netsniff-ng-0.6.8-2.3.aarch64.rpm"
RPM_HASH = "fa4ca8c5c867f9c877bef687b310ba3788d13b78acd59e69530aedac3030297267c00affeeea5abe1c23a56a348900c9059fa14ba4153dd2e50320b5b2d2dffd"

RPROVIDES:${PN} += "config-netsniff-ng \
netsniff-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcli.so.1.10 \
libncursesw.so.6 \
libnet.so.9 \
libnetfilter-conntrack.so.3 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libnl-route-3.so.200 \
libpcap.so.1 \
libsodium.so.23 \
libtinfo.so.6 \
liburcu.so.8"

inherit rpm
