SUMMARY = "Corosync vote quorum library"
DESCRIPTION = "The votequorum library is the external interface to the vote-based \
quorum service. This service is optionally loaded into all nodes in a \
Corosync cluster to avoid split-brain situations. It does this by \
having a number of votes assigned to each system in the cluster and \
ensuring that only when a majority of the votes are present, cluster \
operations are allowed to proceed."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libvotequorum8-2.4.6-1.3.aarch64.rpm"
RPM_HASH = "508397a6ebed7f05ab3a377f22b80c8df9fb5f361badbc1bf033e70dddeb3a1d3cb337ecb81ca9a3ab097e07889a1f32b43d696d942318e731634c39d1f92fb3"

RPROVIDES:${PN} += "libvotequorum.so.8()(64bit) \
libvotequorum.so.8(COROSYNC_VOTEQUORUM_1.0)(64bit) \
libvotequorum8 \
libvotequorum8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcorosync_common.so.4()(64bit) \
libqb.so.100()(64bit)"

inherit rpm
