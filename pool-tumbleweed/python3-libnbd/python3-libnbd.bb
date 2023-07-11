SUMMARY = "Python 3 bindings for libnbd"
DESCRIPTION = "python3-libnbd contains Python 3 bindings for libnbd."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "python3-libnbd-1.14.1-2.2.aarch64.rpm"
RPM_HASH = "fb4c43f36112562d8f01cf2b06e6cebcc6fbc24fca720412160f3ebdc439dec60b761dc599e872ca4ca764d07859c1eb5208a9c0bcb51c44c659975c5739976a"

RPROVIDES:${PN} += "libnbdmod.cpython-311-aarch64-linux-gnu.so \
python3-libnbd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnbd.so.0 \
libnbd0 \
python-abi"

inherit rpm
