SUMMARY = "Corosync vote quorum library"
DESCRIPTION = "The votequorum library is the external interface to the vote-based \
quorum service. This service is optionally loaded into all nodes in a \
Corosync cluster to avoid split-brain situations. It does this by \
having a number of votes assigned to each system in the cluster and \
ensuring that only when a majority of the votes are present, cluster \
operations are allowed to proceed."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libvotequorum8-2.4.6-1.4.aarch64.rpm"
RPM_HASH = "37379d8bb3af217ec7f5a4211ebcf396d67b67ecbdeaea22c5b661da93495ce505c34996cc819de552c8fafc51246f83ae6c123163a95ca94fb745e5ab091aa7"

RPROVIDES:${PN} += "libvotequorum.so.8 \
libvotequorum8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcorosync-common.so.4 \
libqb.so.100"

inherit rpm
