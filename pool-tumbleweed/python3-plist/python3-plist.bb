SUMMARY = "Library for handling Apple Binary and XML Property Lists -- Python Bindings"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists. \
 \
This package contains the python bindings."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.3.0"

RPM_NAME = "python3-plist-2.3.0-1.2.aarch64.rpm"
RPM_HASH = "7faa550e60eb15e4ea815a9635f83c6f16f18732339f26ce9d946ab4cfacf6220f48551817b74e7800fc58a9dbd94dba60f354424bd0d1a45b1f3f805ffca388"

RPROVIDES:${PN} += "python3-plist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libplist-2-0-4 \
libplist-2.0.so.4 \
libpython3.11.so.1.0 \
python-abi \
python3-Cython"

inherit rpm
