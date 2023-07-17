SUMMARY = "Python Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Python bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "4.23.4"

RPM_NAME = "python310-protobuf-4.23.4-6.1.aarch64.rpm"
RPM_HASH = "049bccdc1d26e30c81ec304968eb5e65a0f56970c759ad6311f89c383b76d51e8af2921d9d7de13596a886e8c439df231d8fe72a25d511aa93ef0d8a0dcd156a"

RPROVIDES:${PN} += "python3.10dist-protobuf \
python310-protobuf \
python3dist-protobuf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
