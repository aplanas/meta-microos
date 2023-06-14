SUMMARY = "Library to parse MS Internet Explorer Cache Files"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python311-libmsiecf-20221024-3.5.aarch64.rpm"
RPM_HASH = "6ab2587e29528e133e6b367ccbe744cd0fcbea9dede082f83b566d1afc84de17c52d3e20d7620909fb36f7ec1b7029e28377437ed5f7d34d840a87b8be21ca62"

RPROVIDES:${PN} += "python311-libmsiecf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libmsiecf.so.1 \
python-abi"

inherit rpm
