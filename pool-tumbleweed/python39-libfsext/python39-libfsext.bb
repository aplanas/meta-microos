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

RPM_NAME = "python39-libfsext-20230603-2.1.aarch64.rpm"
RPM_HASH = "d96ff8aa0c5c702ae1b80dae4c355a88f684591afff2e6696697fd8542ab15d9246bf7917c70132f2fa84c18e0331f4f953c88b38f596dfc4c7e3e39a8be8527"

RPROVIDES:${PN} += "python39-libfsext"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsext.so.1 \
python-abi"

inherit rpm
