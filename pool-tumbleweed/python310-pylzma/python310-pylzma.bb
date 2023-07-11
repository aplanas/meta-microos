SUMMARY = "Python bindings for the LZMA compression library"
DESCRIPTION = "PyLZMA provides a platform independent way to read and write data \
that has been compressed or can be decompressed by the LZMA library."
LICENSE = "LGPL-2.1-only"

PV = "0.5.0"

RPM_NAME = "python310-pylzma-0.5.0-2.13.aarch64.rpm"
RPM_HASH = "7d34c9a385b86cf5182d939c287394c5628902133a62bea0bd2a472aac7d35978300a9279cd0ae37c9b1b858a4f7457ebbcf05fe13db65f65ffdf7afcb52ee31"

RPROVIDES:${PN} += "python3.10dist-pylzma \
python310-pylzma \
python3dist-pylzma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
