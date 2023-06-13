SUMMARY = "Corosync Totem protocol"
DESCRIPTION = "An implementation of the Totem Single Ring Ordering and Membership \
protocol providing the Extended Virtual Synchrony model for messaging \
and membership."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libtotem_pg5-2.4.6-1.3.aarch64.rpm"
RPM_HASH = "d1849f96faf518e4a7df6e5c83b7832dead8461ea4feb13a765730c004d0584da20ce6a12d4b0006ea527ac576191184eecab6e23c4c536fa892bc442f6e5840"

RPROVIDES:${PN} += "libtotem_pg.so.5()(64bit) \
libtotem_pg5 \
libtotem_pg5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libqb.so.100()(64bit)"

inherit rpm
