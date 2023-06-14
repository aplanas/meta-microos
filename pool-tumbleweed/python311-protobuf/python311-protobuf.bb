SUMMARY = "Python Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Python bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "python311-protobuf-21.12-3.2.aarch64.rpm"
RPM_HASH = "4bef08d2244700e19a0d4c3255494f5148aa4532f8514a66829b3195f19505be95c05d764c75370c62ccecf1255c198e51d3fed2e632c0d0d6bd7474e54a521b"

RPROVIDES:${PN} += "python3.11dist-protobuf \
python311-protobuf \
python3dist-protobuf"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
