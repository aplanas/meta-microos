SUMMARY = "Library for MacOS data types"
DESCRIPTION = "libfmos is a library for MacOS data types."
LICENSE = "LGPL-3.0-or-later"

PV = "20230707"

RPM_NAME = "python311-libfmos-20230707-1.1.aarch64.rpm"
RPM_HASH = "50a8b093a083098d4e4e0621536d31801a527291ec469cef7e59c36d1c651b52f47fd820debfa20ffe05b107b52f98cd0be21227ed1bc8c0c026fb98bcf2ecfd"

RPROVIDES:${PN} += "python3-libfmos \
python311-libfmos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfmos.so.1 \
python-abi"

inherit rpm
