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

RPM_NAME = "python310-libfsapfs-20221102-3.11.aarch64.rpm"
RPM_HASH = "5ef27f928549733b95edbbef4738bc54732478fc9fd81b28336f846de097dc99b8a9e96ae8b8cf4bc1b0672cfccb424bf30d1f20f82b597e9165188329e255dc"

RPROVIDES:${PN} += "python3-libfsapfs \
python310-libfsapfs \
python310-libfsapfs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libfsapfs.so.1()(64bit) \
libfsapfs.so.1(V_20221102)(64bit) \
python(abi)"

inherit rpm