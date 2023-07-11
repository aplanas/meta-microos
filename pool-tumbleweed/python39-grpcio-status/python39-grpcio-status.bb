SUMMARY = "Status proto mapping for gRPC"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems. \
 \
This package implements the GRPC Python status proto mapping."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "python39-grpcio-status-1.56.0-1.1.aarch64.rpm"
RPM_HASH = "e9d30769c1471f4ab624c7537167aef171086841d4af0107b603c9ea72feb98021293bd4697b91d22b7cdf5e872a15515e95f58e27a0aa4aa867c6690b3de1f6"

RPROVIDES:${PN} += "python3.9dist-grpcio-status \
python39-grpcio-status \
python3dist-grpcio-status"

RDEPENDS:${PN} += "python-abi \
python39-googleapis-common-protos \
python39-grpcio \
python39-protobuf"

inherit rpm
