SUMMARY = "IPv4 tool for verifying multicast connectivity"
DESCRIPTION = "mcjoin can be used to join IPv4 multicast groups, display \
progress as multicast packets are received, and also send \
multicast packets on select groups. \
 \
mcjoin can help verify intended IGMP snooping functionality \
in layer-2 bridges/switches, as well as test forwarding of \
multicast in static or dynamic multicast routing setups."
LICENSE = "ISC"

PV = "2.11"

RPM_NAME = "mcjoin-2.11-1.2.aarch64.rpm"
RPM_HASH = "f5b2415e491c95dfda14ec3ca06dbf0246424a72e914af415d56978a14275c3e0f860d155fd317284d8d4e650bcdc0c7a02214c5fc1da81f84e8fda6ea872c83"

RPROVIDES:${PN} += "mcjoin"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
