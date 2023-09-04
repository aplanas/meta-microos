SUMMARY = "Library and tools to access LUKS Disk Encryption encrypted files"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "python310-libluksde-20221103-4.1.aarch64.rpm"
RPM_HASH = "0c913ad210cf8801387f3269fbd86863c2e1b1df55a6ef1e4016a299261d75cb27e51da890f5cac257b76bde9fc6b1975478bad2e7ff42a35dbf604da45f86f8"

RPROVIDES:${PN} += "python310-libluksde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libluksde.so.1 \
python-abi"

inherit rpm
