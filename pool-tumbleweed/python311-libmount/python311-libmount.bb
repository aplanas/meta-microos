SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.39.1"

RPM_NAME = "python311-libmount-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "d085a4f758e2e0dff92d8d22dc85fd825c4923e335d9bcd1b832d52762bdd70c79e230882322b8f187e526bd8d217b874be03a16c7aa33de44ae6a6b6352dccc"

RPROVIDES:${PN} += "python3-libmount \
python311-libmount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmount.so.1 \
permissions \
python-abi"

inherit rpm
