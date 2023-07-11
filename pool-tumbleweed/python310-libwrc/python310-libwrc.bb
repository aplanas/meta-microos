SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "python310-libwrc-20230318-1.4.aarch64.rpm"
RPM_HASH = "5d6aa9ded78e59c372c4093d59c5257b2cd9b38b9e18c55278fadebce17143a6fcab9fcdca62ad9bfd54a0b2256bab464b184957a650dd5ae6bf38e50f3c5113"

RPROVIDES:${PN} += "python310-libwrc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libwrc.so.1 \
python-abi"

inherit rpm
