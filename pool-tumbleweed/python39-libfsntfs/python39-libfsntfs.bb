SUMMARY = "Library and tools to access the NTFS filesystem"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230606"

RPM_NAME = "python39-libfsntfs-20230606-2.1.aarch64.rpm"
RPM_HASH = "32f43f4d12fe78fce9ef6af7c7b2c130b4b4b0dd851791cfefebd068987440ea72cdaeabfc4e8fbbbb539991c19dbd4ace87b46fd38f8f73ef1d77d7852c4d8e"

RPROVIDES:${PN} += "python39-libfsntfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfsntfs.so.1 \
python-abi"

inherit rpm
