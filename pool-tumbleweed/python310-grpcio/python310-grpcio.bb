SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "python310-grpcio-1.56.0-2.1.aarch64.rpm"
RPM_HASH = "e149248948dfa032e3d158b024a89916f0bb342e66beb7ef66f5f17eacde6c06c0ad575a8c3f44fbbd9a80982b985504794aea42c038e0d4a0c18f65565f3edd"

RPROVIDES:${PN} += "python3.10dist-grpcio \
python310-grpcio \
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
