SUMMARY = "Library and tools to access the NTFS filesystem"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230606"

RPM_NAME = "python311-libfsntfs-20230606-1.5.aarch64.rpm"
RPM_HASH = "58a10a555d664d75d83ef49eda69c4b6f69e8b3f938d42257458e09eb4ee86084a286727459b9fd2ddb36c4c35a64762020586ae82699c243b6cc7dcb4f02ce6"

RPROVIDES:${PN} += "python3-libfsntfs \
python311-libfsntfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfsntfs.so.1 \
python-abi"

inherit rpm
