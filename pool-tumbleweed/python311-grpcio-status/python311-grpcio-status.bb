SUMMARY = "Status proto mapping for gRPC"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems. \
 \
This package implements the GRPC Python status proto mapping."
LICENSE = "Apache-2.0"

PV = "1.44.0"

RPM_NAME = "python311-grpcio-status-1.44.0-1.5.aarch64.rpm"
RPM_HASH = "9f5a3b68a2ba78e8e60cabfc2992fac6bac0cff6564ddc3cea6ba5fdf032f72b12a1b2eb8127d492dd9684247a412fefae81945a1703221af01dac8060db5a5c"

RPROVIDES:${PN} += "python3.11dist(grpcio-status) \
python311-grpcio-status \
python311-grpcio-status(aarch-64) \
python3dist(grpcio-status)"

RDEPENDS:${PN} += "python(abi) \
python311-googleapis-common-protos \
python311-grpcio \
python311-protobuf"

inherit rpm
