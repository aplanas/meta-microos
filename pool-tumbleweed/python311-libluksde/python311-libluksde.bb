SUMMARY = "Library and tools to access LUKS Disk Encryption encrypted files"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "python311-libluksde-20221103-3.11.aarch64.rpm"
RPM_HASH = "409bfb7eb898af31b19c3f69670838d1ce1d9c90671ffb7d8ffb6c7799f9f3145fd86eb1afdbd1228c32bfccdabbdd4641cfa0e133952cbdbaf8b8ba5b077fe4"

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
