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

RPM_NAME = "netdiscover-0.10-1.3.aarch64.rpm"
RPM_HASH = "ffe2e709ce9c32869626f5d6f8bcab494be552f27ff797a785caf6b1cf7246cddd9bcf613f8aa0a01f5639da2efb8f5b70d841b76c562d68c554e55cdaae1cf4"

RPROVIDES:${PN} += "netdiscover \
netdiscover(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpcap.so.1()(64bit)"

inherit rpm
