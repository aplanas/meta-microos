SUMMARY = "Protobuf code generator for gRPC"
DESCRIPTION = "This package provides a python-based Protobuf code generator for gRPC."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "python39-grpcio-tools-1.56.0-2.1.aarch64.rpm"
RPM_HASH = "afeb27ee164210c35bf1c427ccd883a26d0ee5cec9d2103a23b3c350dd614047db44513affed7d44aac5b0e721f38d6c345b0bca53de52c86a05be2ec7758bfc"

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
python39-protobuf"

inherit rpm
