SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems."
LICENSE = "Apache-2.0"

PV = "1.54.0"

RPM_NAME = "python311-grpcio-1.54.0-1.1.aarch64.rpm"
RPM_HASH = "d4ff4586cd0716da47045a3bddb5862bef1127ea59bbb4e2c2c52a1112d8d23e58af9d07d12241968b8540e86713269c90b1097a6449329a6d090dbf11dceb6d"

RPROVIDES:${PN} += "python3.11dist-grpcio \
python311-grpcio \
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
python311-six"

inherit rpm
