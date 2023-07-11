SUMMARY = "Library and tools to access the NTFS filesystem"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230606"

RPM_NAME = "python311-libfsntfs-20230606-1.4.aarch64.rpm"
RPM_HASH = "ac407d0a6dd42479c5158027f7f98a721291fa5289bb565104aefdacba86465834c6806f8bdac02aee26b716383e37d74f0ac58040d778c730862cd0c5951c03"

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
