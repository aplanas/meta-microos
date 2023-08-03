SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "python310-grpcio-1.56.0-2.2.aarch64.rpm"
RPM_HASH = "5ff3eb12df807b775d3d1e909214c4b427eca98533e3f31288fff17d400963600b2b915aff9195094912e4906ccf1eb777c4516dfe03c66dc040a65891515c07"

RPROVIDES:${PN} += "python3.10dist-grpcio \
python310-grpcio \
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
