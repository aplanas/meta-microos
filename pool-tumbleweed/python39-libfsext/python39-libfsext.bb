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

RPM_NAME = "python39-libfsext-20230603-1.5.aarch64.rpm"
RPM_HASH = "3fdf3557e25f2c72ef2c88ab4e71cb375917f123b559f2900aff6a4732062cb3cfd411d83edc0ce773c23db1d75a10e0db9a063d59a113cc27fb587848fccd6c"

RPROVIDES:${PN} += "python39-libfsext"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsext.so.1 \
python-abi"

inherit rpm
