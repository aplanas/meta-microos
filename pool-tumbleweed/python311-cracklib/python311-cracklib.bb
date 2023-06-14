SUMMARY = "A CPython extension module wrapping the libcrack library"
DESCRIPTION = "This CPython extension provides Python bindings for cracklib. It \
contains a pythonic interface to cracklib's functions and some Python \
convenience functions."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.6"

RPM_NAME = "python311-cracklib-2.9.6-1.1.aarch64.rpm"
RPM_HASH = "081fa72559410e93b13b146be281d99d0404e608041c9e77847595c1ac6fa114c4c23d008cea6df54ac45aebbd66521d8eb54f1fd62e1969249232afcfda560f"

RPROVIDES:${PN} += "python3.11dist-cracklib \
python311-cracklib \
python3dist-cracklib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrack.so.2 \
python-abi"

inherit rpm
