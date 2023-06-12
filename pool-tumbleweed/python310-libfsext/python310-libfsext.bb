SUMMARY = "Library and tools to access the Extended File System"
DESCRIPTION = "libfsext is a library to access the Extended File System (ext). \
 \
Read-only supported ext formats: \
 \
* ext2 (version 2) \
* ext3 (version 3) \
* ext4 (version 4) \
 \
Supported ext format features: \
 \
* ext4 inline data \
 \
Unsupported ext format features: \
 \
* ext (version 1) \
* compression \
* encryption"
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230603"

RPM_NAME = "python310-libfsext-20230603-1.1.aarch64.rpm"
RPM_HASH = "c2e56d35b8f7e2d458bc4840deeee293943fd2ca4c6ec581874b21887790d7d75e79d5351c8fdb748cb60dac327894c0590d8f6a0433d2f6797682c46e457d58"

RPROVIDES:${PN} += "python3-libfsext \
python310-libfsext \
python310-libfsext(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfsext.so.1()(64bit) \
libfsext.so.1(V_20230603)(64bit) \
python(abi)"

inherit rpm
