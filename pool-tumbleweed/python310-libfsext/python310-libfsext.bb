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

RPM_NAME = "python310-libfsext-20230603-2.1.aarch64.rpm"
RPM_HASH = "1b6075bcdc61be9880269b00ce425d5cefb82f939c6a0b2dca9c00b65bccb31ba3a325057c08f55dd73c889278f45b844f9306fe60907b3cb697d390ed41ece2"

RPROVIDES:${PN} += "python310-libfsext"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsext.so.1 \
python-abi"

inherit rpm
