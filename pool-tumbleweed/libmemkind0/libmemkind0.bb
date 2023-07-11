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

RPM_NAME = "libmemkind0-1.14.0-1.3.aarch64.rpm"
RPM_HASH = "654c1bb2fc21d1b5e2b6936151160f33e98886851edc6aec97a32f492c086d4093dd1365849d00a52c0426a23d8b8f3b327a6e08980d4c90ac8685045b4051bd"

RPROVIDES:${PN} += "libmemkind.so.0 \
libmemkind0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnuma.so.1"

inherit rpm
