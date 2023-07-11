SUMMARY = "Network grep"
DESCRIPTION = "ngrep strives to provide most of GNU grep's common features, applying them \
to the network layer. ngrep is a pcap-aware tool that allows you to specify \
extended regular or hexadecimal expressions to match against data payloads \
of packets. It currently recognizes IPv4/6, TCP, UDP, ICMPv4/6, IGMP and \
Raw across Ethernet, PPP, SLIP, FDDI, Token Ring and null interfaces, and \
understands BPF filter logic in the same fashion as more common packet \
sniffing tools, such as tcpdump and snoop."
LICENSE = "BSD-4-Clause"

PV = "1.47"

RPM_NAME = "ngrep-1.47-2.4.aarch64.rpm"
RPM_HASH = "46d7f1a7987927d028fe3d9656dafdf08afccab1e9f2ebb7e850a78f543553217d82f2e6874f256521ba4189e2f90e86356a2f9861fd05f06939820f023c8830"

RPROVIDES:${PN} += "ngrep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1 \
libpcre2-8.so.0"

inherit rpm
