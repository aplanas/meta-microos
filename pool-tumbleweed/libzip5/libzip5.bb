SUMMARY = "C library for reading, creating, and modifying zip archives"
DESCRIPTION = "This is libzip, a C library for reading, creating, and modifying zip \
archives.  Files can be added from data buffers, files, or compressed \
data copied directly from other zip archives.  Changes made without \
closing the archive can be reverted.  The API is documented by man \
pages."
LICENSE = "BSD-3-Clause"

PV = "1.10.1"

RPM_NAME = "libzip5-1.10.1-1.1.aarch64.rpm"
RPM_HASH = "8e9af206263e07af241948b4e6ba26fd7ce76493a9a430c3bc3ed58d7f1c373106b5c3bfeef13301515db35f2afd7a9d11e39a599d0cf39d028c4d6d2b428e62"

RPROVIDES:${PN} += "libzip.so.5 \
libzip5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgnutls.so.30 \
liblzma.so.5 \
libnettle.so.8 \
libz.so.1 \
libzstd.so.1"

inherit rpm
