SUMMARY = "Library and tools to access the NTFS filesystem"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230606"

RPM_NAME = "python311-libfsntfs-20230606-2.1.aarch64.rpm"
RPM_HASH = "52453f66ae18408a51af1dab07d5a025467fb15f3759650e9d9bf3af6ac3ca804d3cac0248ef3b1fe4dd42e2ffd06572b91424afb2fde07df6d0508e61bf047c"

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
