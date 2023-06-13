SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems."
LICENSE = "Apache-2.0"

PV = "1.54.0"

RPM_NAME = "python310-grpcio-1.54.0-1.1.aarch64.rpm"
RPM_HASH = "3e27b872f1cf11edc81efd9d89bee7ce739f4882ca09a71b415e98f82908fd53bee3796e321ade32e08da2b1c474708b1dc081f22822db3224268c360b37cdc4"

RPROVIDES:${PN} += "python3-grpcio \
python3.10dist(grpcio) \
python310-grpcio \
python310-grpcio(aarch-64) \
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
python310-six"

inherit rpm
