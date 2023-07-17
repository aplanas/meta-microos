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

RPM_NAME = "python310-libfsext-20230603-1.5.aarch64.rpm"
RPM_HASH = "7ec59eea23929a836332538b660beea4c97b9298a5cc7ef4d1c4acecd0f6a01cd2dfe1110e3998f662de5df8089bf99cfd083eb47a55793c3fc5c04316e3422f"

RPROVIDES:${PN} += "python310-libfsext"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsext.so.1 \
python-abi"

inherit rpm
