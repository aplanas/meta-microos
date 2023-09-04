SUMMARY = "Protobuf code generator for gRPC"
DESCRIPTION = "This package provides a python-based Protobuf code generator for gRPC."
LICENSE = "Apache-2.0"

PV = "1.56.2"

RPM_NAME = "python310-grpcio-tools-1.56.2-1.1.aarch64.rpm"
RPM_HASH = "82979989c1cfe7ca23f4937abfe87dc7297f67c3a3d06b7862ffd79b657c0a976bc5741891dfbfc93e6f206c3972286e2293ae37967749692ab82645b4ab6aa2"

RPROVIDES:${PN} += "python3.10dist-grpcio-tools \
python310-grpcio-tools \
python3dist-grpcio-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-grpcio \
python310-protobuf \
python310-setuptools"

inherit rpm
