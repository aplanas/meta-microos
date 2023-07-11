SUMMARY = "Static multicast routing for UNIX"
DESCRIPTION = "SMCRoute is a UNIX/Linux tool to manage and monitor multicast routes. \
It supports both IPv4 and IPv6 multicast routing. \
 \
SMCRoute can be used as an alternative to dynamic multicast routers like \
mrouted or pimd in setups where static multicast routes should be \
maintained and/or no proper IGMP or MLD signaling exists. \
 \
Multicast routes exist in the UNIX kernel as long as a multicast routing \
daemon runs. On Linux, multiple multicast routers can run simultaneously \
using different multicast routing tables."
LICENSE = "GPL-3.0-only"

PV = "2.5.6"

RPM_NAME = "smcroute-2.5.6-1.3.aarch64.rpm"
RPM_HASH = "28adfc4adfc28c15834cc0693bd9ae997859e1777c4d219bc7646644b8ff4e39b224f4315d59f423a441cb656f756933a859812b9f2daa517b97859ae2555fdb"

RPROVIDES:${PN} += "config-smcroute \
smcroute"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2"

inherit rpm
