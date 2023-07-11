SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.39"

RPM_NAME = "python310-libmount-2.39-1.1.aarch64.rpm"
RPM_HASH = "2147dcafc6706a6866200d8116d36b01041d08a3c1bf5cefd3ab15e0987afcbcb06ae901c231ac978405698010ae0fecd6ae7e24a826db12ad4a8aabbb6b3aae"

RPROVIDES:${PN} += "python310-libmount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmount.so.1 \
permissions \
python-abi"

inherit rpm
