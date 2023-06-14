SUMMARY = "Library and tools for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "python311-libfsxfs-20220829-3.8.aarch64.rpm"
RPM_HASH = "ac7a1a0e540416c4500f65c464b67296f91fcbdfb2b9c193f1e95bb4a1bbffb05531cebf70242b508bcd1b16aa9e8398d706a3bdb391210c196f233e66c509b5"

RPROVIDES:${PN} += "python311-libfsxfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsxfs.so.1 \
python-abi"

inherit rpm
