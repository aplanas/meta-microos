SUMMARY = "An implementation of the DVMRP multicast routing protocol"
DESCRIPTION = "Mrouted is an implementation of the Distance-Vector Multicast Routing \
Protocol (DVMRP), an earlier version of which is specified in RFC-1075. \
 \
Mrouted turns a UNIX workstation into a DVMRP multicast router with tunnel \
support, in order to cross non-multicast-aware routers.  The tunnels are \
virtual point-to-point, IP-IP tunnel, links between a pair of mrouted routers."
LICENSE = "BSD-3-Clause & BSD-4-Clause"

PV = "4.4"

RPM_NAME = "mrouted-4.4-1.8.aarch64.rpm"
RPM_HASH = "ba420a12b0fa1355d1d427b881905d2783ba97d1d9c4c815a663375c4b22f520dc81197b7141d2726983a4ef4f81fa1447dab67e4d3e686434a462b368617e40"

RPROVIDES:${PN} += "config(mrouted) \
mrouted \
mrouted(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
systemd"

inherit rpm
