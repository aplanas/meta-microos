SUMMARY = "Corosync quorum library"
DESCRIPTION = "The quorum library is the external interface to the quorum service. \
This service is loaded into all nodes in a Corosync cluster and track \
the quorum status of a node."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libquorum5-2.4.6-1.3.aarch64.rpm"
RPM_HASH = "736e35fbcb23c353c8445dc9d966c5014b1a48bf4a2793cddb4ab1bc8f84467f8ece5dcbe0778ca364b6e3b6a0fb47e5632d07c83bbaa9b4eda3ec5881abaf13"

RPROVIDES:${PN} += "libquorum.so.5 \
libquorum5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcorosync-common.so.4 \
libqb.so.100"

inherit rpm
