SUMMARY = "Python bindings for the libmount library"
DESCRIPTION = "This package contains the Python bindings for util-linux libmount \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.39"

RPM_NAME = "python311-libmount-2.39-2.1.aarch64.rpm"
RPM_HASH = "6dbfc952e419cc886a0097aed2f10afbbdd8957cb4a3795983d7e8b5aeca752c6824d478c5dff22e86c36e3bd58458765f0162da2bf6a9496eada7d3fde656bc"

RPROVIDES:${PN} += "python3-libmount \
python311-libmount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmount.so.1 \
permissions \
python-abi"

inherit rpm
