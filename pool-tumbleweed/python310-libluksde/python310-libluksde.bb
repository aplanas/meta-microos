SUMMARY = "Library and tools to access LUKS Disk Encryption encrypted files"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "python310-libluksde-20221103-3.9.aarch64.rpm"
RPM_HASH = "c4a5d5ab678e0389bc47ea0360af9ef973f18e6141c923911d7874647f488b494d32281fb5d6995c90760965db2a2fd17ee230e3af56db4a2a356290c051ffa4"

RPROVIDES:${PN} += "python3-libluksde \
python310-libluksde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libluksde.so.1 \
python-abi"

inherit rpm
