SUMMARY = "Target node process executed by librpmem"
DESCRIPTION = "The rpmemd process is executed on a target node by librpmem library \
and facilitates access to persistent memory over RDMA."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "rpmemd-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "3d0e017241d9fce5cc7c2795991a75e70abd96cf4875ce8b752b7107cb00dca033d3b01943b3d6412302fcf4924bd83a340b81fb78179aecee0bc5889bba4c6a"

RPROVIDES:${PN} += "rpmemd \
rpmemd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdaxctl.so.1()(64bit) \
libdaxctl.so.1(LIBDAXCTL_2)(64bit) \
libfabric \
libfabric.so.1()(64bit) \
libfabric.so.1(FABRIC_1.0)(64bit) \
libfabric.so.1(FABRIC_1.1)(64bit) \
libfabric.so.1(FABRIC_1.3)(64bit) \
libndctl.so.6()(64bit) \
libndctl.so.6(LIBNDCTL_1)(64bit) \
libndctl.so.6(LIBNDCTL_15)(64bit) \
libndctl.so.6(LIBNDCTL_18)(64bit) \
libndctl.so.6(LIBNDCTL_3)(64bit) \
libpmem.so.1()(64bit) \
libpmem.so.1(LIBPMEM_1.0)(64bit)"

inherit rpm
