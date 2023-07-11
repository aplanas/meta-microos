SUMMARY = "Protobuf code generator for gRPC"
DESCRIPTION = "This package provides a python-based Protobuf code generator for gRPC."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "python310-grpcio-tools-1.56.0-2.1.aarch64.rpm"
RPM_HASH = "ec8d2f25c0dbce5e86f8b100e5cab9190121dd4db94b7b8c0572392716a8bac1f35b3063a9e04580c95151e426b97858a55d96965a84d376025d7a1864b72f4e"

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
python310-protobuf"

inherit rpm
