SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.38.1"

RPM_NAME = "python39-libmount-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "54c6cf9b9914a36bc539702b0988117cfa40b5e8f84e04a32d8a45d5255bb58b7b96d9cbe87cc9fc460d98f6a571480d6c7a1c190ef85e4b8809959246de2c02"

RPROVIDES:${PN} += "python39-libmount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmount.so.1 \
permissions \
python-abi"

inherit rpm
