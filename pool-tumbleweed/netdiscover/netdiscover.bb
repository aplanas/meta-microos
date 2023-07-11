SUMMARY = "A network address discovering/monitoring tool"
DESCRIPTION = "Netdiscover is an active/passive address reconnaissance tool, mainly developed \
for those wireless networks without dhcp server, when you are wardriving. It \
can be also used on hub/switched networks. \
 \
Built on top of libnet and libpcap, it can passively detect online hosts, or \
search for them, by actively sending arp requests, it can also be used to \
inspect your network arp traffic, and find network addresses using auto scan \
mode, which will scan for common local networks."
LICENSE = "GPL-3.0-or-later"

PV = "0.10"

RPM_NAME = "netdiscover-0.10-1.5.aarch64.rpm"
RPM_HASH = "436b4993de68cca28b2f873325b1b33eba472da298fe6545633b1f390f4d96b1a4bcce404217cd83bccd7b4436bf47ac4a356b3042ec05c75397762c2fd68795"

RPROVIDES:${PN} += "netdiscover"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcap.so.1"

inherit rpm
