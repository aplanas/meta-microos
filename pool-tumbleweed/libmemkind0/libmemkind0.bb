SUMMARY = "User Extensible Heap Manager shared library"
DESCRIPTION = "The memkind library is an user extensible heap manager built on top \
of jemalloc which enables control of memory characteristics and a \
partitioning of the heap between kinds of memory. The kinds of memory \
are defined by operating system memory policies that have been \
applied to virtual address ranges. Memory characteristics supported \
by memkind without user extension include control of NUMA and page \
size features. The jemalloc non-standard interface has been extended \
to enable specialized arenas to make requests for virtual memory from \
the operating system through the memkind partition interface. Through \
the other memkind interfaces, the user can control and extend memory \
partition features and allocate memory while selecting enabled \
features."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "libmemkind0-1.14.0-1.2.aarch64.rpm"
RPM_HASH = "ecc4c6c96abafe0286bec9fe9acf7a406d191b633094ecf57a7689a5bb5ce7808fa67ddb8a60debb91aa1ac2f1ee512ceb937fb2ebf255d6c12f809e1c217329"

RPROVIDES:${PN} += "libmemkind.so.0()(64bit) \
libmemkind0 \
libmemkind0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnuma.so.1()(64bit) \
libnuma.so.1(libnuma_1.1)(64bit) \
libnuma.so.1(libnuma_1.2)(64bit)"

inherit rpm
