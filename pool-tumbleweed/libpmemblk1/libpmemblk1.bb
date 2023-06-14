SUMMARY = "Persistent Memory Resident Block library"
DESCRIPTION = "libpmemblk implements a pmem-resident array of blocks, all the same \
size, where a block is updated atomically with respect to power \
failure or program interruption (no torn blocks)."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmemblk1-1.11.1-1.8.aarch64.rpm"
RPM_HASH = "95e01d78fe47b49b03074ccb3a81d163c33ad3312c79af3b8fe6f7c91c74f6cfd910f16488561c0a947e1dfafccd9bf8d5b9775fe561f4eaa164daf4d75cbd24"

RPROVIDES:${PN} += "libpmemblk.so.1 \
libpmemblk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem.so.1"

inherit rpm
