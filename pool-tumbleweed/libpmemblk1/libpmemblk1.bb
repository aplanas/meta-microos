SUMMARY = "Persistent Memory Resident Block library"
DESCRIPTION = "libpmemblk implements a pmem-resident array of blocks, all the same \
size, where a block is updated atomically with respect to power \
failure or program interruption (no torn blocks)."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "libpmemblk1-1.11.1-1.9.aarch64.rpm"
RPM_HASH = "ed79dc143b17853087652e6fe6f1071b9e2f369de5278f6541f7bd1387ec8c5396a6ca699d659e6bcfbef730942c74b593ceb62831f6f0bd8e416101b30e1fd4"

RPROVIDES:${PN} += "libpmemblk.so.1 \
libpmemblk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaxctl.so.1 \
libndctl.so.6 \
libpmem.so.1"

inherit rpm
