SUMMARY = "Library and tools to access LUKS Disk Encryption encrypted files"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "python311-libluksde-20221103-4.1.aarch64.rpm"
RPM_HASH = "915bef67ea7ea9ccbc42a25fb329c4c880788072c54f604e765fa93d9ad0614499b2e1f304e2c48590e8503c29453cb8d797043836f5fa64d261493f97027429"

RPROVIDES:${PN} += "python3-libluksde \
python311-libluksde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libluksde.so.1 \
python-abi"

inherit rpm
