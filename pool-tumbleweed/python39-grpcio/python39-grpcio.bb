SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "python39-grpcio-1.56.0-2.1.aarch64.rpm"
RPM_HASH = "a499b49c00afa658881965454ecbe1f04edf83198bbf99fd08178835bb77fb9a9e1e0338e91e45fc7e41f605dfebd41c3e27c1623f04d69b457106403e3f6ce2"

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
python-abi"

inherit rpm
