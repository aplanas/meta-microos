SUMMARY = "Protobuf code generator for gRPC"
DESCRIPTION = "This package provides a python-based Protobuf code generator for gRPC."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "python311-grpcio-tools-1.56.0-2.1.aarch64.rpm"
RPM_HASH = "e34178985cd8429c731c50e430972e847070acf494b84c4449c35854a20b2fdb5907b111a11b7c2e06a55a7676be90bbee0875d6ef12b75db53e8dfd881c06a0"

RPROVIDES:${PN} += "python3-grpcio-tools \
python3.11dist-grpcio-tools \
python311-grpcio-tools \
python3dist-grpcio-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-grpcio \
python311-protobuf"

inherit rpm
