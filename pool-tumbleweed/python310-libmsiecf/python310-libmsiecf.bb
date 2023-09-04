SUMMARY = "Library to parse MS Internet Explorer Cache Files"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python310-libmsiecf-20221024-4.1.aarch64.rpm"
RPM_HASH = "24980ccaa974f9b541065ef6ec8951d7115c078321b6f5449c5b51d74c08e63e40450cdd6f9ce16b4a7580065c34b80491f79691074f31174e5512b016204808"

RPROVIDES:${PN} += "python310-libmsiecf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libmsiecf.so.1 \
python-abi"

inherit rpm
