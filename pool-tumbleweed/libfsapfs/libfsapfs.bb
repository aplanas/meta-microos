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

PV = "20221102"

RPM_NAME = "libfsapfs-20221102-3.11.aarch64.rpm"
RPM_HASH = "4f7655f80fbd51af413da6bcee8a7523a6ef3486f4392c8f2ff18ba375063a996f03ad86e4fb6628250f66c991cfa345f8d421b363a34b6cfb82cd77dbcf8767"

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
