SUMMARY = "Library for AES encryption"
DESCRIPTION = "libcaes is a library for AES encryption."
LICENSE = "LGPL-3.0-or-later"

PV = "20230406"

RPM_NAME = "python39-libcaes-20230406-1.4.aarch64.rpm"
RPM_HASH = "d33d9efd7d9c9e8f0ed105bb4a8a365c25a6bce46e296db076926142dba3c6bc711d4f5976fee3b0c0c38ff61a4f0b26de1749870c3c5e3bc523321d7e593b83"

RPROVIDES:${PN} += "python39-libcaes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcaes.so.1 \
libcerror.so.1 \
python-abi"

inherit rpm
