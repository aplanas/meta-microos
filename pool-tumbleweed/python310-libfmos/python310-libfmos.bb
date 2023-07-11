SUMMARY = "Library for MacOS data types"
DESCRIPTION = "libfmos is a library for MacOS data types."
LICENSE = "LGPL-3.0-or-later"

PV = "20230707"

RPM_NAME = "python310-libfmos-20230707-1.1.aarch64.rpm"
RPM_HASH = "efad0f609397c2063f29ed84959e91b1c44bc0a11c14908eb0beea8771d8b4b64036a1dcd6a476a24592f0cd6fff6824a19e62c16fe59aac8216d551f12a71de"

RPROVIDES:${PN} += "python310-libfmos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfmos.so.1 \
python-abi"

inherit rpm
