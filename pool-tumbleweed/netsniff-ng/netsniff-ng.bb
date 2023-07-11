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

RPM_NAME = "netsniff-ng-0.6.8-2.4.aarch64.rpm"
RPM_HASH = "6ebbf47b4f81dc5eb13929c3c8f6563ad0fe01d0cadac8ab1823410c758f4d77ff6576353d705364e6504b7fe698760a05c169b866cc2ec1633a1b9e2dff652f"

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
