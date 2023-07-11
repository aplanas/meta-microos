SUMMARY = "Python Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Python bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "4.23.3"

RPM_NAME = "python311-protobuf-4.23.3-5.1.aarch64.rpm"
RPM_HASH = "d077d33da14381f8af9f703df2e0d38bf90762553cf937fdc9747800b322fa88a45127093358c9854094b688830d38ee55be7b40d44c6520c5e7af3879f975a8"

RPROVIDES:${PN} += "python3-protobuf \
python3.11dist-protobuf \
python311-protobuf \
python3dist-protobuf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
