SUMMARY = "Library for MacOS data types"
DESCRIPTION = "libfmos is a library for MacOS data types."
LICENSE = "LGPL-3.0-or-later"

PV = "20230707"

RPM_NAME = "python310-libfmos-20230707-2.1.aarch64.rpm"
RPM_HASH = "dce094adbef983ae419f6551b8a41f98a4a9cba0a0cb9d8360989661949ad6f5632e138adec8874927d5d1b2fda26cda055616326e7463f4e97f1134e6d7b412"

RPROVIDES:${PN} += "python310-libfmos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfmos.so.1 \
python-abi"

inherit rpm
