SUMMARY = "Protobuf code generator for gRPC"
DESCRIPTION = "This package provides a python-based Protobuf code generator for gRPC."
LICENSE = "Apache-2.0"

PV = "1.54.0"

RPM_NAME = "python310-grpcio-tools-1.54.0-1.1.aarch64.rpm"
RPM_HASH = "bc74e43c9e38675c8039076561e532c5350ad92849861f041d0ede8cd3de68ab87ca5b11230bff6ae55b1e31bace472934d99a8352e8aefde6e3404cc50dbbd6"

RPROVIDES:${PN} += "python3-grpcio-tools \
python3.10dist(grpcio-tools) \
python310-grpcio-tools \
python310-grpcio-tools(aarch-64) \
python3dist(grpcio-tools)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python310-grpcio \
python310-protobuf"

inherit rpm
