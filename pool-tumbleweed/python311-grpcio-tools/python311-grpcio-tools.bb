SUMMARY = "Protobuf code generator for gRPC"
DESCRIPTION = "This package provides a python-based Protobuf code generator for gRPC."
LICENSE = "Apache-2.0"

PV = "1.56.2"

RPM_NAME = "python311-grpcio-tools-1.56.2-1.1.aarch64.rpm"
RPM_HASH = "1154e91da40f19507740ec4f9fb4fbda3ba31ffc2b63bc9f97afb2b451460d88443e8ca81ae34e974b30467f83a7e399389a4efcba65f5675abfd6e515559212"

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
