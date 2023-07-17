SUMMARY = "Library and tools to access LUKS Disk Encryption encrypted files"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "python310-libluksde-20221103-3.12.aarch64.rpm"
RPM_HASH = "09f10a6e9c589adbe521f47e5df6210bf12944b8ee61ebeee27ca0d220ead65015f61fe33766e32ecc61cb1e1a828d92aa7b28cfda4e756b7d66a68f686a7468"

RPROVIDES:${PN} += "python310-libluksde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libluksde.so.1 \
python-abi"

inherit rpm
