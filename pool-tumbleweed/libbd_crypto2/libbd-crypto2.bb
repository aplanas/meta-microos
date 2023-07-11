SUMMARY = "The crypto plugin for the LibBlockDev library"
DESCRIPTION = "This LibBlockDev library plugin (and, at the same time, a standalone library) \
provides functionality related to LUKS-style encrypted devices."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_crypto2-2.28-1.6.aarch64.rpm"
RPM_HASH = "9bfb06b9fc814c27d7411ee776751ec66538876b19a9d440b54ccde0734d6cf5a10c9733ea98e9ea03b9646edffe1ce3b88940e7125bacebd04e6993c942fa6c"

RPROVIDES:${PN} += "libbd-crypto.so.2 \
libbd-crypto2 \
libblockdev-crypto"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbd-utils.so.2 \
libblkid.so.1 \
libc.so.6 \
libcryptsetup.so.12 \
libglib-2.0.so.0"

inherit rpm
