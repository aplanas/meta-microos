SUMMARY = "Library and tools to access the Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python311-libphdi-20221025-3.12.aarch64.rpm"
RPM_HASH = "6e2626df22b780888756be1b3eb13e9536012f582aaabe0d6960d46dbe4a1fcd76b17ed9a4e666c708ddf2244fc4b39b1667e09878cda95716e884d121d71936"

RPROVIDES:${PN} += "python3-libphdi \
python311-libphdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libphdi.so.1 \
python-abi"

inherit rpm
