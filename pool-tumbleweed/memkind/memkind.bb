SUMMARY = "User Extensible Heap Manager"
DESCRIPTION = "The memkind library is an user extensible heap manager built on top \
of jemalloc which enables control of memory characteristics and a \
partitioning of the heap between kinds of memory."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "memkind-1.14.0-1.3.aarch64.rpm"
RPM_HASH = "a0020a22157f1ffd0af066aa591ad0139ff908687f793c43185dfe805847dbe840b30161e76ef7351c1cc499b9fdc788a338da1e5b562a7b51c905b79227d360"

RPROVIDES:${PN} += "memkind"

RDEPENDS:${PN} += "libc.so.6 \
libmemkind.so.0 \
libnuma.so.1"

inherit rpm
