SUMMARY = "Library and tools to access the NTFS filesystem"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230606"

RPM_NAME = "python310-libfsntfs-20230606-1.5.aarch64.rpm"
RPM_HASH = "e2d9cd94dcc564ea675ee7e09e1039fca951a97b96e031edf5c9af0eb87e9c2740771ac9453f82632cc5b2f13bc4469211bf041cb6bbf95fd98b2f787ed19135"

RPROVIDES:${PN} += "python310-libfsntfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfsntfs.so.1 \
python-abi"

inherit rpm
