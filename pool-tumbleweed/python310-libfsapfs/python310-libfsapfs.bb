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

RPM_NAME = "python310-libfsapfs-20230617-1.3.aarch64.rpm"
RPM_HASH = "27da5482cdb0413445e6b2c6eaf89d627275247f676e68f3e5c29f560e5f838587d420cc8af9f865f7ad636cbb08ac4aa60d01e359794acfc3112a2178dd6d2d"

RPROVIDES:${PN} += "python310-libfsapfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfsapfs.so.1 \
python-abi"

inherit rpm
