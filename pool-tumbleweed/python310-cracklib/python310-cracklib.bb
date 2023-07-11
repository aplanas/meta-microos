SUMMARY = "A CPython extension module wrapping the libcrack library"
DESCRIPTION = "This CPython extension provides Python bindings for cracklib. It \
contains a pythonic interface to cracklib's functions and some Python \
convenience functions."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.6"

RPM_NAME = "python310-cracklib-2.9.6-1.3.aarch64.rpm"
RPM_HASH = "79b424352cd66998ec3f096a344a367319d865af9dd5abb1dd553ca00b86e5884fec56be643b9d0607013af3d592a98f1828605e50277dce036f823169559cb8"

RPROVIDES:${PN} += "python3.10dist-cracklib \
python310-cracklib \
python3dist-cracklib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrack.so.2 \
python-abi"

inherit rpm
