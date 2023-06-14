SUMMARY = "Multiple Host Ping that supports ICMPv4 and ICMPv6"
DESCRIPTION = "noping continuously pings lists of hosts, displays ping statistics 'live' \
and highlights aberrant round-trip times."
LICENSE = "GPL-2.0-only"

PV = "1.10.0"

RPM_NAME = "noping-1.10.0-1.18.aarch64.rpm"
RPM_HASH = "235cc1821b906dbf31f332566babadac7a62c4c39abe649bcf89d7ae315e5346ce375e0c9c3f294c175c41bfa892971dd26e228ed2eca40329c10855eb03bf8e"

RPROVIDES:${PN} += "noping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
liboping \
liboping.so.0 \
libtinfo.so.6"

inherit rpm
