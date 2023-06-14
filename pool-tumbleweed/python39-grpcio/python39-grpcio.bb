SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems."
LICENSE = "Apache-2.0"

PV = "1.54.0"

RPM_NAME = "python39-grpcio-1.54.0-1.1.aarch64.rpm"
RPM_HASH = "5cc388a40d2c4165135844c4626cd94b72162236123eb2db6e53cbb6c3a49a4ff3d3a53b87dddb04f563f947053641aea2da7393c90568fb2d7f4236e4de00ef"

RPROVIDES:${PN} += "python3.9dist-grpcio \
python39-grpcio \
python3dist-grpcio"

RDEPENDS:${PN} += "ca-certificates \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libcrypto.so.3 \
libm.so.6 \
libre2.so.10 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
python-abi \
python39-six"

inherit rpm
