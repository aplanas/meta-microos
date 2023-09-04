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

RPM_NAME = "python311-libfsext-20230603-2.1.aarch64.rpm"
RPM_HASH = "4c491be74a616763b1bc1ad55162cf928dcf32aa55f4407cd1990dd6f238c19ad260684352420de2bad41e64fb6145f64916fe0885cce54d029208d77042e1ff"

RPROVIDES:${PN} += "python3-libfsext \
python311-libfsext"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsext.so.1 \
python-abi"

inherit rpm
