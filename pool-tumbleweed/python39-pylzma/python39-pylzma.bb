SUMMARY = "Python bindings for the LZMA compression library"
DESCRIPTION = "PyLZMA provides a platform independent way to read and write data \
that has been compressed or can be decompressed by the LZMA library."
LICENSE = "LGPL-2.1-only"

PV = "0.5.0"

RPM_NAME = "python39-pylzma-0.5.0-2.11.aarch64.rpm"
RPM_HASH = "b93f4e878d01740e3c5daccece1dbd16cd0200c288da06953f8a822c1f1d026ca65a0f5fc3427780e4d9da2de9a8641424f81f509041f3357f8116dc29509f91"

RPROVIDES:${PN} += "python3.9dist(pylzma) \
python39-pylzma \
python39-pylzma(aarch-64) \
python3dist(pylzma)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
