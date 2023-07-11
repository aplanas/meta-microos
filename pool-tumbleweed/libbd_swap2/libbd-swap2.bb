SUMMARY = "The swap plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to swap devices."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_swap2-2.28-1.6.aarch64.rpm"
RPM_HASH = "4801cca525d9282589d675dd9f8af87cf46d141dd890df7378e891e4f6525e780f14b4ec8472e85d825719584b1b002641081af937647ddb0cecb20d2094609f"

RPROVIDES:${PN} += "libbd-swap.so.2 \
libbd-swap2 \
libblockdev-swap"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.2 \
libbd-utils2 \
libblkid.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
util-linux"

inherit rpm
