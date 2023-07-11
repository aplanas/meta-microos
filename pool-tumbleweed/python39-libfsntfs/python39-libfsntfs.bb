SUMMARY = "Library and tools to access the NTFS filesystem"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230606"

RPM_NAME = "python39-libfsntfs-20230606-1.4.aarch64.rpm"
RPM_HASH = "bfac78873b22443413772e631554755dd100a6e9b0ab66e553a1017bcaac120dc7dbf33ae2f67b775d19afa915baa697b9acbdabb17771373773a76afe3c538a"

RPROVIDES:${PN} += "python39-libfsntfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfsntfs.so.1 \
python-abi"

inherit rpm
