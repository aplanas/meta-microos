SUMMARY = "Library and tools to access LUKS Disk Encryption encrypted files"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "python39-libluksde-20221103-4.1.aarch64.rpm"
RPM_HASH = "26bf2e74ba9009fa5eb452706b83581f7a0985b3d9d97cbe38b80d23ba3450548c202cff5a278c6fa56aac9d4eb6bf04a0c6900ab7d104090afe3ade62923098"

RPROVIDES:${PN} += "python39-libluksde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libluksde.so.1 \
python-abi"

inherit rpm
