SUMMARY = "A CPython extension module wrapping the libcrack library"
DESCRIPTION = "This CPython extension provides Python bindings for cracklib. It \
contains a pythonic interface to cracklib's functions and some Python \
convenience functions."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.6"

RPM_NAME = "python39-cracklib-2.9.6-1.3.aarch64.rpm"
RPM_HASH = "aea8884882ab32d4efd0ce3c822b50f2fae81a28aaab13f98818227947b348085724a0a6732d1341e1ac8d63157daf13aacdeb849f9a0a745620db6c7472ef5a"

RPROVIDES:${PN} += "python3.9dist-cracklib \
python39-cracklib \
python3dist-cracklib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrack.so.2 \
python-abi"

inherit rpm
