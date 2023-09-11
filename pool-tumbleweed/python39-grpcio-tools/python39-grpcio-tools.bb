SUMMARY = "Protobuf code generator for gRPC"
DESCRIPTION = "This package provides a python-based Protobuf code generator for gRPC."
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "python39-grpcio-tools-1.57.0-1.1.aarch64.rpm"
RPM_HASH = "17191ca2fdc8b9f5388d4c918788a36973b1c42db2ee26e8cdaac9a0e7256eeb66aa21d5fdf2d030579b9270871a35e306459b5e622fbfb5ec4ef78181dd2382"

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
