SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.39"

RPM_NAME = "python39-libmount-2.39-3.1.aarch64.rpm"
RPM_HASH = "f1f8aafc9bc50f6cd84ba3368547ea4608674aff535e3af55b4a411f6d2b6e846cc5feda1c64e810d8df93fc5a95d177bfdf17f8fa7ea76f7a284171b3b154b7"

RPROVIDES:${PN} += "python39-libmount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmount.so.1 \
permissions \
python-abi"

inherit rpm
