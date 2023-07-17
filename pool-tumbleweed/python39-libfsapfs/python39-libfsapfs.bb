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

RPM_NAME = "python39-libfsapfs-20230617-1.4.aarch64.rpm"
RPM_HASH = "ab2a705a381c26d373a08b1a9c34b0eb05d24da4c2f6e7c8adfb8ff2cfa91963b9c3adb7a8c6b3cd64337f4588b152ae933dd71c76fc04fec63b7a8b648c3d73"

RPROVIDES:${PN} += "python39-libfsapfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfsapfs.so.1 \
python-abi"

inherit rpm
