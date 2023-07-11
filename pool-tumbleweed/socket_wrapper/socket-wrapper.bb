SUMMARY = "A library passing all socket communications through Unix sockets"
DESCRIPTION = "socket_wrapper helps client/server software development to gain functional test \
coverage. It can run several instances of a software stack on the same machine \
and perform functional testing of network configurations locally. \
 \
To use it, set the following environment variables: \
 \
LD_PRELOAD=libsocket_wrapper.so \
SOCKET_WRAPPER_DIR=/path/to/swrap_dir"
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "socket_wrapper-1.4.2-1.1.aarch64.rpm"
RPM_HASH = "a8afc8f65ecb9d8720a24a5fedb9140069940917daf2fc18e973194d9ba2872fc5a7d859302ec74ea36ed5061523aaf270b1b529f8de66b795b3f074cb3ed055"

RPROVIDES:${PN} += "cmake-socket-wrapper \
cmake-socket-wrapper-noop \
libsocket-wrapper.so.0 \
pkgconfig-socket-wrapper \
socket-wrapper"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
