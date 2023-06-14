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

RPM_NAME = "python311-libfsapfs-20221102-3.11.aarch64.rpm"
RPM_HASH = "812e7877466c48ac6c637db5068a9522d3f5fb0a206331aec3c7446df37bb4b884989e5fa403b211757d5972dcb466159c4f3b27658ce162ff5f83605b96178c"

RPROVIDES:${PN} += "python311-libfsapfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfsapfs.so.1 \
python-abi"

inherit rpm
