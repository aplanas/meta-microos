SUMMARY = "Protobuf code generator for gRPC"
DESCRIPTION = "This package provides a python-based Protobuf code generator for gRPC."
LICENSE = "Apache-2.0"

PV = "1.54.0"

RPM_NAME = "python39-grpcio-tools-1.54.0-1.1.aarch64.rpm"
RPM_HASH = "bcbd85b51a57da61e8c74955c613ded4444bd3cd8c64d02f75262dd67b0a7edf682b03ea8f88dedf7938f042ad23f5ff7a1c734bd1a3f3482f5d3c76470a4d17"

RPROVIDES:${PN} += "python3.9dist-grpcio-tools \
python39-grpcio-tools \
python3dist-grpcio-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python39-grpcio \
python39-protobuf"

inherit rpm
