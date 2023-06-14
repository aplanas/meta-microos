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

RPM_NAME = "smcroute-2.5.6-1.2.aarch64.rpm"
RPM_HASH = "99a635fec3b0edcfeb718f24c8eef209b9548ffd312defba422cbe8c0bd235bb8ac380a52cb2b1315f02f9603ac43f05ee8baae26afefcc4b853e51d657a40c5"

RPROVIDES:${PN} += "config-smcroute \
smcroute"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2"

inherit rpm
