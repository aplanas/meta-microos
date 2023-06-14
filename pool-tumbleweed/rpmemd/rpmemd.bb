SUMMARY = "Target node process executed by librpmem"
DESCRIPTION = "The rpmemd process is executed on a target node by librpmem library \
and facilitates access to persistent memory over RDMA."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "rpmemd-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "3d0e017241d9fce5cc7c2795991a75e70abd96cf4875ce8b752b7107cb00dca033d3b01943b3d6412302fcf4924bd83a340b81fb78179aecee0bc5889bba4c6a"

RPROVIDES:${PN} += "rpmemd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libfabric \
libfabric.so.1 \
libndctl.so.6 \
libpmem.so.1"

inherit rpm
