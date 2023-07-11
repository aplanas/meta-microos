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

RPM_NAME = "python311-libfsext-20230603-1.4.aarch64.rpm"
RPM_HASH = "51b462821d8ad783ad136ffabf8af0f92279d74ef50d3b07f64502854b5d2a6c4e81ebc36194ccc2bf7f3db15077e8f141672c394cebf9896484d4a6459f4acc"

RPROVIDES:${PN} += "python3-libfsext \
python311-libfsext"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsext.so.1 \
python-abi"

inherit rpm
