SUMMARY = "Library and tools to access the Apple File System (APFS)"
DESCRIPTION = "libfsapfs is a library to access the Apple File System (APFS). \
 \
Read-only supported APFS formats: \
 \
* version 2 \
 \
Supported APFS format features: \
 \
* ZLIB (DEFLATE) compression \
* LZVN compression \
* encryption \
 \
Unsupported APFS format features: \
 \
* APFS version 1 \
* Fusion drive (NX_INCOMPAT_FUSION) \
* snapshots \
* LZFSE compression, compression methods 11 and 12 \
* 'uncompressed', compression methods 1, 9 and 10 \
* T2 encryption"
LICENSE = "LGPL-3.0-only"

PV = "20230617"

RPM_NAME = "libfsapfs-20230617-1.4.aarch64.rpm"
RPM_HASH = "a99bf58c4d46656187bb64daed0502981d316c648b5a31d27c0f1483c64e25c8c62fbbc393b395cb85b393c4668657421e69855ea8351a70d62b80b4aaa18b08"

RPROVIDES:${PN} += "libfsapfs \
python2-libfsapfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfsapfs.so.1 \
libfuse.so.2 \
libhmac.so.1 \
libuna.so.1"

inherit rpm
