SUMMARY = "Library and tools to access LUKS Disk Encryption encrypted files"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "python39-libluksde-20221103-3.11.aarch64.rpm"
RPM_HASH = "b2223cabf802189c4d5bb7579114ef033e97bd3a15134a69651a02e166b07f4ad7988eff33d5432d1f1b11229894a286245be804cb933bcbd1f390d903165d65"

RPROVIDES:${PN} += "python39-libluksde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libluksde.so.1 \
python-abi"

inherit rpm
