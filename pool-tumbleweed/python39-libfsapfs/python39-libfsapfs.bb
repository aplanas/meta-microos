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

RPM_NAME = "python39-libfsapfs-20221102-3.11.aarch64.rpm"
RPM_HASH = "376156cd0dd63e352d0f2096c478b5667dacfb7ca9bf37d3cbc79cd9ff3e7368a1bdb4c4dc669bfb6eee2f19e186d1d660bffc7aec25f0da75603864282dc9fc"

RPROVIDES:${PN} += "python39-libfsapfs \
python39-libfsapfs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6()(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libfsapfs.so.1()(64bit) \
libfsapfs.so.1(V_20221102)(64bit) \
python(abi)"

inherit rpm
