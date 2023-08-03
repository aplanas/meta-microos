SUMMARY = "Library and tools to access the NTFS filesystem"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230606"

RPM_NAME = "python310-libfsntfs-20230606-2.1.aarch64.rpm"
RPM_HASH = "b332f6e63c0660aad25b0344827a2bd24b85eaf9765ead219f2ce9faa2106ae899e3ad9f4cd3a719a461ed29f532cdbe8a74f477745fde0e911a29dcd0610cfb"

RPROVIDES:${PN} += "python310-libfsntfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfsntfs.so.1 \
python-abi"

inherit rpm
