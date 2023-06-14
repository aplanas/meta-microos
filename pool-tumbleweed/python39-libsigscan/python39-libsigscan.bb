SUMMARY = "Library for binary signature scanning"
DESCRIPTION = "libsigscan is a library for binary signature scanning \
 \
libsigscan is part of the libyal family of libraries"
LICENSE = "LGPL-3.0-or-later"

PV = "20230109"

RPM_NAME = "python39-libsigscan-20230109-1.4.aarch64.rpm"
RPM_HASH = "8e5e5846f52c0cca1b6c5ec82fc9f1d054599951464d820128b8df991d12b73382f42ce8a7e866ad84b7d682600df3f01dbf6b68a72c3a7842e4d5c4919fb00d"

RPROVIDES:${PN} += "python39-libsigscan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsigscan.so.1 \
python-abi"

inherit rpm
