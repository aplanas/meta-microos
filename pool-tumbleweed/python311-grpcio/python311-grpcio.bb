SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "python311-grpcio-1.56.0-2.1.aarch64.rpm"
RPM_HASH = "acf2d2aa2edd2d06ffb319e9d3da543739be1c1275d6102998569af4732fae5806f35ae597269799ff100a9a087746285caba5ac291e9f819bfc856acb9679dd"

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
libre2.so.10 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
python-abi"

inherit rpm
