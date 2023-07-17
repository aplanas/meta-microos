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

RPM_NAME = "python311-libfsext-20230603-1.5.aarch64.rpm"
RPM_HASH = "6b81709f315949da3270d5126a24ef9b139ea5e1b3b2a872e852511b6211e1daff0782a27d03facb9edc07f6823fad24f51a98fda66b2db00f03d2fbcaedcc33"

RPROVIDES:${PN} += "python3-libfsext \
python311-libfsext"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsext.so.1 \
python-abi"

inherit rpm
