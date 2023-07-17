SUMMARY = "Library and tools to access LUKS Disk Encryption encrypted files"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "python311-libluksde-20221103-3.12.aarch64.rpm"
RPM_HASH = "6c2b639b614214f014ba0e7a8d0113905344358883a19e4d7fb1fc3a5b2bc303aa5067f67c20ba87b95c664c86d7bfe4446a8996d8c4e411d5c640ca7def3f4e"

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
