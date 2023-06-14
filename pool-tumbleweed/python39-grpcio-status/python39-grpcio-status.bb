SUMMARY = "Status proto mapping for gRPC"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems. \
 \
This package implements the GRPC Python status proto mapping."
LICENSE = "Apache-2.0"

PV = "1.44.0"

RPM_NAME = "python39-grpcio-status-1.44.0-1.5.aarch64.rpm"
RPM_HASH = "78c3a9f3a87862b60e9b96242ced3fb793cfcd967b29de79e184d872abbaff2e462b64d168c04fed4287477276cfe60217c00e298c1ef297e6cd79a54d8fce21"

RPROVIDES:${PN} += "python3.9dist-grpcio-status \
python39-grpcio-status \
python3dist-grpcio-status"

RDEPENDS:${PN} += "python-abi \
python39-googleapis-common-protos \
python39-grpcio \
python39-protobuf"

inherit rpm
