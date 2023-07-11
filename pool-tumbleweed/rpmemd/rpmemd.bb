SUMMARY = "Target node process executed by librpmem"
DESCRIPTION = "The rpmemd process is executed on a target node by librpmem library \
and facilitates access to persistent memory over RDMA."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "rpmemd-1.11.1-1.9.aarch64.rpm"
RPM_HASH = "efb5d57be414dc4c1044fb908132207c73a0c6aa03984870c00cde5d413a7caf68f6e4aa20c6ec142dc34f970d819e1e54d0015d944156152687a52014d1f326"

RPROVIDES:${PN} += "rpmemd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libfabric \
libfabric.so.1 \
libndctl.so.6 \
libpmem.so.1"

inherit rpm
