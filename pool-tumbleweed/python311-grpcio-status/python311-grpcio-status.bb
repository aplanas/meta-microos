SUMMARY = "Status proto mapping for gRPC"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems. \
 \
This package implements the GRPC Python status proto mapping."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "python311-grpcio-status-1.56.0-1.1.aarch64.rpm"
RPM_HASH = "9c5382cc8a89f5b6eb2f5bc113d56f5de2cc3f0cef318411d2efcf9cb837779c0dd0aae58aa185688fda5543ed24c7a7d4c27dcd7a8fc84137feec54ba7f6270"

RPROVIDES:${PN} += "python3-grpcio-status \
python3.11dist-grpcio-status \
python311-grpcio-status \
python3dist-grpcio-status"

RDEPENDS:${PN} += "python-abi \
python311-googleapis-common-protos \
python311-grpcio \
python311-protobuf"

inherit rpm
