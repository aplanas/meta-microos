SUMMARY = "Corosync Totem protocol"
DESCRIPTION = "An implementation of the Totem Single Ring Ordering and Membership \
protocol providing the Extended Virtual Synchrony model for messaging \
and membership."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libtotem_pg5-2.4.6-1.4.aarch64.rpm"
RPM_HASH = "84e00e6516529710ea4f69fef09c34b964ae56976aae1daab366cfba7b3a3a1278815d20a9fa3f94bcc5eb5dfbd649b48111103438327c2dad1d4b9ab737d8b7"

RPROVIDES:${PN} += "libtotem-pg.so.5 \
libtotem-pg5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so \
libqb.so.100"

inherit rpm
