SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "python39-grpcio-1.56.0-2.2.aarch64.rpm"
RPM_HASH = "f37db2111fab4c616400a336b24a6593f222f9486ef88206c7fff754c9e3f661e3f51888cf7b865aa75b8f54068aace9213e39a7b54418eb87bedf49c5bb050d"

RPROVIDES:${PN} += "python3.9dist-grpcio \
python39-grpcio \
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
