SUMMARY = "Python ls-qpack QPACK library"
DESCRIPTION = "Python wrapper for the ls-qpack QPACK library."
LICENSE = "BSD-3-Clause"

PV = "0.3.16"

RPM_NAME = "python310-pylsqpack-0.3.16-2.1.aarch64.rpm"
RPM_HASH = "b8a847d3b4e4e17c14cd18e764abc9d9e30fc8a81ffd6392ea1a57e936fbc49fc27c30f8a76b52427126ccef8160ba36411f5b2db4ff9066a7021bc4cac94c6b"

RPROVIDES:${PN} += "python3.10dist-pylsqpack \
python310-pylsqpack \
python3dist-pylsqpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
