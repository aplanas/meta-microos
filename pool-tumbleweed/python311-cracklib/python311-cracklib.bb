SUMMARY = "A CPython extension module wrapping the libcrack library"
DESCRIPTION = "This CPython extension provides Python bindings for cracklib. It \
contains a pythonic interface to cracklib's functions and some Python \
convenience functions."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.6"

RPM_NAME = "python311-cracklib-2.9.6-1.3.aarch64.rpm"
RPM_HASH = "f9684c6bcd45186cd22653428bdacd435759215d328750050e2458e97e2dfcb3d0b12067b98cf73061c7627693f5d43bb4e1308bbbeec5de7d633daedf336d3c"

RPROVIDES:${PN} += "python3-cracklib \
python3.11dist-cracklib \
python311-cracklib \
python3dist-cracklib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrack.so.2 \
python-abi"

inherit rpm
