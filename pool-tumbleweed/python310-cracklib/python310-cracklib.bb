SUMMARY = "A CPython extension module wrapping the libcrack library"
DESCRIPTION = "This CPython extension provides Python bindings for cracklib. It \
contains a pythonic interface to cracklib's functions and some Python \
convenience functions."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.6"

RPM_NAME = "python310-cracklib-2.9.6-1.1.aarch64.rpm"
RPM_HASH = "6b88e91b4aab6aba3ffad55de0bec253c11d77e49ba81528a7316b7e38aa152c7ea6ad51f50c9801bbf4eb76a369b690af902b0181e39d3abe03fe0be4d08aa7"

RPROVIDES:${PN} += "python3-cracklib \
python3.10dist-cracklib \
python310-cracklib \
python3dist-cracklib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrack.so.2 \
python-abi"

inherit rpm
