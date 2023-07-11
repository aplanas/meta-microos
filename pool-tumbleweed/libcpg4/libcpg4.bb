SUMMARY = "Corosync group message API"
DESCRIPTION = "A group message API called CPG, part of Corosync. This library is \
used to create distributed applications that operate properly during \
cluster partitions, merges, and faults."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libcpg4-2.4.6-1.4.aarch64.rpm"
RPM_HASH = "0f76928af6f31f0d2c386213b6faee2c3c9ecafb7c2fd1ba54ba103eca1f09e6d9c0391d52cd561ec426261d3ff09cf85bca35eeae4c20689d19bd3943b39fff"

RPROVIDES:${PN} += "libcpg.so.4 \
libcpg4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcorosync-common.so.4 \
libqb.so.100"

inherit rpm
