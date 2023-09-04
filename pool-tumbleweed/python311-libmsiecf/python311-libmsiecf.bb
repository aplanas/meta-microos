SUMMARY = "Library to parse MS Internet Explorer Cache Files"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python311-libmsiecf-20221024-4.1.aarch64.rpm"
RPM_HASH = "d3539326f1a5209eff31d78ad4c26d43fa5d1e165836b608018369ef9cc176a2b75a5f47814c04a7351a18e803f14d3a3801f46d6f8d0e123634ed95facd5dcb"

RPROVIDES:${PN} += "python3-libmsiecf \
python311-libmsiecf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libmsiecf.so.1 \
python-abi"

inherit rpm
