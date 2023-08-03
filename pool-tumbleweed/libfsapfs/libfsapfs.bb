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

RPM_NAME = "libfsapfs-20230617-2.1.aarch64.rpm"
RPM_HASH = "ff6d0ad997d5b576a6c034630d8a288b7fa5b5416c0b11e0d79148f441a3c8e3e67742d579f055443c612b3c471d443801e2633f8414dd470d5d80546a132365"

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
