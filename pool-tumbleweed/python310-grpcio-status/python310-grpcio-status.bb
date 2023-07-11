SUMMARY = "Status proto mapping for gRPC"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems. \
 \
This package implements the GRPC Python status proto mapping."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "python310-grpcio-status-1.56.0-1.1.aarch64.rpm"
RPM_HASH = "8dca4bef409382c46d6a8ee214891dbd38ba74283a8d8cf839bb73725f71e32b29b70f2808e72d63646bdb12255be43225b05fee34eca63a1be378614e268cbe"

RPROVIDES:${PN} += "python3.10dist-grpcio-status \
python310-grpcio-status \
python3dist-grpcio-status"

RDEPENDS:${PN} += "python-abi \
python310-googleapis-common-protos \
python310-grpcio \
python310-protobuf"

inherit rpm
