SUMMARY = "The swap plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to swap devices."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_swap2-2.28-1.4.aarch64.rpm"
RPM_HASH = "4e633e6412fdc0a13ce87c6fb45d5822292c48fcfd4c83dcc39503462cf9f2c4da246ec7bdb87bdb0839a106bb0ecfbaf9d5fc1058b6efa4dfad4e53cac47fbb"

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
