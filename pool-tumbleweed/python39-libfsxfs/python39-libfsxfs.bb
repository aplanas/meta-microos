SUMMARY = "Library and tools for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "python39-libfsxfs-20220829-3.11.aarch64.rpm"
RPM_HASH = "b15712c6ca6080f9ced5fbccd9dfe17816646a4f7da354b60469d02feea1d32cf547b6b177fa43e6dab3a6f4be7bd27e801b62ed3987f3ee368a934b77d5806f"

RPROVIDES:${PN} += "python39-libfsxfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsxfs.so.1 \
python-abi"

inherit rpm
