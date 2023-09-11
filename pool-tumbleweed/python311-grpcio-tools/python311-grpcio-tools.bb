SUMMARY = "Protobuf code generator for gRPC"
DESCRIPTION = "This package provides a python-based Protobuf code generator for gRPC."
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "python311-grpcio-tools-1.57.0-1.1.aarch64.rpm"
RPM_HASH = "cad4d024f5e7c2682b89909fb6b1e824c1913f1a4c277b81f3101cb3ff2960948d1a40221cec5e20f268b0e1314b513f53bb975e23f24adb78474a070e78972b"

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
python311-protobuf \
python311-setuptools"

inherit rpm
