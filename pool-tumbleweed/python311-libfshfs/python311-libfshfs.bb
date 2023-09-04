SUMMARY = "Library and tools to access the Mac OS Hierarchical File System (HFS)"
DESCRIPTION = "Read-only supported HFS formats: \
 \
* HFS+, Mac OS 10.3 and later (Unicode 3.2 case-insensitive) \
* HFSX, Mac OS 10.3 and later (Unicode 3.2 case-sensitive) \
 \
Unsupported HFS formats: \
 \
* (traditional) HFS \
* HFS+, Mac OS 8.1 through 10.2 (Unicode 2.1 case-insensitive) \
* HFSX, Mac OS 8.1 through 10.2 (Unicode 2.1 case-sensitive) \
 \
Supported HFS format features: \
 \
* ZLIB (DEFLATE) compression \
* LZVN compression \
* extended attributes \
 \
Unsupported HFS format features: \
 \
* LZFSE compression, compression methods 11 and 12 \
* 'uncompressed', compression methods 1, 9 and 10"
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220831"

RPM_NAME = "python311-libfshfs-20220831-4.1.aarch64.rpm"
RPM_HASH = "5503b9fab73868126b5d4d057a469d379211ab287f569b8162c5770fbfe65fe6f24db4ab087428c3312a24e5f15413895c4631a2e55073a1f317748eef755a19"

RPROVIDES:${PN} += "python3-libfshfs \
python311-libfshfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfshfs.so.1 \
python-abi"

inherit rpm
