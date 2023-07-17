SUMMARY = "Library and tools to access LUKS Disk Encryption encrypted files"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "python39-libluksde-20221103-3.12.aarch64.rpm"
RPM_HASH = "170bf0066c51a3814758b4249f3f69162587c4d1d707b38b9947d6455bd28a1c9a1f132d02350e25d9c03842dd00ee9ada928e3da0cf86ed8795495232c95c2e"

RPROVIDES:${PN} += "python39-libluksde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libluksde.so.1 \
python-abi"

inherit rpm
