SUMMARY = "Library and tools to access LUKS Disk Encryption encrypted files"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "python310-libluksde-20221103-3.11.aarch64.rpm"
RPM_HASH = "7c4cad7b4b43f72d303182ebe25452a741eca187446746eeaeea592e95be5411cce980be6df3715fb6128000266b6ae92b260b3fd2c33e94e64ee4522c2569e8"

RPROVIDES:${PN} += "python310-libluksde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libluksde.so.1 \
python-abi"

inherit rpm
