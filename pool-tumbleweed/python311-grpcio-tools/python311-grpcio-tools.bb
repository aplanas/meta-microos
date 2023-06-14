SUMMARY = "Protobuf code generator for gRPC"
DESCRIPTION = "This package provides a python-based Protobuf code generator for gRPC."
LICENSE = "Apache-2.0"

PV = "1.54.0"

RPM_NAME = "python311-grpcio-tools-1.54.0-1.1.aarch64.rpm"
RPM_HASH = "08dc63321f9e91b9f232aca5b9f0c46b18cc87f372cee2b8f5e50d5b3f43c1d81fdc4c663118d50f7f2c4b36d5af2efa85d0cb593d4fd715ce3702d9cbf4cfe5"

RPROVIDES:${PN} += "python3.11dist-grpcio-tools \
python311-grpcio-tools \
python3dist-grpcio-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python311-grpcio \
python311-protobuf"

inherit rpm
