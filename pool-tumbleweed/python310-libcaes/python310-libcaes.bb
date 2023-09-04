SUMMARY = "Library for AES encryption"
DESCRIPTION = "libcaes is a library for AES encryption."
LICENSE = "LGPL-3.0-or-later"

PV = "20230406"

RPM_NAME = "python310-libcaes-20230406-2.1.aarch64.rpm"
RPM_HASH = "a2948820296e97dc06a4c73db7e0a809c426e7257c49f8f2cce7b658ae8a3b30bab53048bac407cc2d1892f9d19d8f0b6e174a2a9dfd4d1fb46d349ee870829b"

RPROVIDES:${PN} += "python310-libcaes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcaes.so.1 \
libcerror.so.1 \
python-abi"

inherit rpm
