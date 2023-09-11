SUMMARY = "Protobuf code generator for gRPC"
DESCRIPTION = "This package provides a python-based Protobuf code generator for gRPC."
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "python310-grpcio-tools-1.57.0-1.1.aarch64.rpm"
RPM_HASH = "aef64c829132e38ccd1a3b4d2bcaa83890ac09062a898525c0d8ad2f356c3aad09eb5bd3e7a85cb4f8003b9f3641295413ce1dd8c786572bd99e714faef9b679"

RPROVIDES:${PN} += "python3.10dist-grpcio-tools \
python310-grpcio-tools \
python3dist-grpcio-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-grpcio \
python310-protobuf \
python310-setuptools"

inherit rpm
