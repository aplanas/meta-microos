SUMMARY = "Protobuf code generator for gRPC"
DESCRIPTION = "This package provides a python-based Protobuf code generator for gRPC."
LICENSE = "Apache-2.0"

PV = "1.56.2"

RPM_NAME = "python39-grpcio-tools-1.56.2-1.1.aarch64.rpm"
RPM_HASH = "0e03b72d634ecbfaf03661a7c252dbf5643b6cb7bd703572e9bc9d2c46bb0a86d3967b0c6968c08d461dde3e543872868cc32d2d721ddbaa56223d24e7dd1f5e"

RPROVIDES:${PN} += "python3.9dist-grpcio-tools \
python39-grpcio-tools \
python3dist-grpcio-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-grpcio \
python39-protobuf \
python39-setuptools"

inherit rpm
