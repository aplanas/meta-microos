SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.39"

RPM_NAME = "python311-libmount-2.39-3.1.aarch64.rpm"
RPM_HASH = "e61f12737608af8a2e12922891958eabb49d087550bb5d30c21262c83cdfe65686288dd95ee88ec762c42342c35571103c1fbb1349be3d7ddda40ed25e075001"

RPROVIDES:${PN} += "python3-libmount \
python311-libmount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmount.so.1 \
permissions \
python-abi"

inherit rpm
