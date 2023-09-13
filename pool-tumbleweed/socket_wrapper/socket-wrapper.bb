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

RPM_NAME = "socket_wrapper-1.4.2-2.1.aarch64.rpm"
RPM_HASH = "c18a98cf802e5e3ff64e2ac4c45a6282383ae8fb34cc3f69c8bd1658f52cf4d45d282c51c9b0f8116520376d2f1974bf9dbf36182b4b82794e82f7f7704c9b4d"

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
