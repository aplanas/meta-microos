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

RPM_NAME = "python39-libfsapfs-20230617-1.3.aarch64.rpm"
RPM_HASH = "c5e5f715cac5985d08b2ed065b42a697cd766c1f6cbfe2507f2d6422e84b6635a77b27e36791567cf420f532f1a41b398e5d10702864c02ca7596c49294d208b"

RPROVIDES:${PN} += "python39-libfsapfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfsapfs.so.1 \
python-abi"

inherit rpm
