SUMMARY = "Library for AES encryption"
DESCRIPTION = "libcaes is a library for AES encryption."
LICENSE = "LGPL-3.0-or-later"

PV = "20230406"

RPM_NAME = "python310-libcaes-20230406-1.4.aarch64.rpm"
RPM_HASH = "e249aa2a41583845623600cf984f934410e75c2819307b52b0d701af1920fee0265308c51344e088845a111b06ab546ae362c9c6e92e3f3b46e80ef38586e8bc"

RPROVIDES:${PN} += "python310-libcaes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcaes.so.1 \
libcerror.so.1 \
python-abi"

inherit rpm
