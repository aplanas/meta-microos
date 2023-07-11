SUMMARY = "Python bindings for the LZMA compression library"
DESCRIPTION = "PyLZMA provides a platform independent way to read and write data \
that has been compressed or can be decompressed by the LZMA library."
LICENSE = "LGPL-2.1-only"

PV = "0.5.0"

RPM_NAME = "python39-pylzma-0.5.0-2.13.aarch64.rpm"
RPM_HASH = "072071f71c4dfd4e1348aba63c165f25b2eb7bd58dd4e47e03bad1a4f484d5717f1b8f30092a196493712ddba9de792942682437f454d544857724c3f8ac2ebb"

RPROVIDES:${PN} += "python3.9dist-pylzma \
python39-pylzma \
python3dist-pylzma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
