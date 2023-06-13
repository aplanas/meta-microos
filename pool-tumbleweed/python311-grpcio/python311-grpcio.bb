SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems."
LICENSE = "Apache-2.0"

PV = "1.54.0"

RPM_NAME = "python311-grpcio-1.54.0-1.1.aarch64.rpm"
RPM_HASH = "d4ff4586cd0716da47045a3bddb5862bef1127ea59bbb4e2c2c52a1112d8d23e58af9d07d12241968b8540e86713269c90b1097a6449329a6d090dbf11dceb6d"

RPROVIDES:${PN} += "python3.11dist(grpcio) \
python311-grpcio \
python311-grpcio(aarch-64) \
python3dist(grpcio)"

RDEPENDS:${PN} += "ca-certificates \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcares.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libm.so.6()(64bit) \
libre2.so.10()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
python(abi) \
python311-six"

inherit rpm
