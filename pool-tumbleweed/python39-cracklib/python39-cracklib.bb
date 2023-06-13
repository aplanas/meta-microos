SUMMARY = "A CPython extension module wrapping the libcrack library"
DESCRIPTION = "This CPython extension provides Python bindings for cracklib. It \
contains a pythonic interface to cracklib's functions and some Python \
convenience functions."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.6"

RPM_NAME = "python39-cracklib-2.9.6-1.1.aarch64.rpm"
RPM_HASH = "fa425756bd21bc2be15051cee31bebfa4bb4f7038ad0c42593eb7a7f8f2b3d9f3d70170bc6e48abc35961807fbe0b68589b8cc7e4bb27e838b128fb0e250a674"

RPROVIDES:${PN} += "python3.9dist(cracklib) \
python39-cracklib \
python39-cracklib(aarch-64) \
python3dist(cracklib)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrack.so.2()(64bit) \
python(abi)"

inherit rpm
