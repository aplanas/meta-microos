SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "python311-grpcio-1.56.0-2.2.aarch64.rpm"
RPM_HASH = "6407b6828d45073b23d82f9be0be802f52e09475ed04b75f2d7a9ea3fc48d203814c53c13962738af6206d2b94faaf83ee5a4a55c848b65859f517b564166cf6"

RPROVIDES:${PN} += "python3-grpcio \
python3.11dist-grpcio \
python311-grpcio \
python3dist-grpcio"

RDEPENDS:${PN} += "ca-certificates \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libcrypto.so.3 \
libm.so.6 \
libre2.so.11 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
python-abi"

inherit rpm
