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

PV = "1.4.0"

RPM_NAME = "socket_wrapper-1.4.0-2.3.aarch64.rpm"
RPM_HASH = "366a01843ec2da9ba056f038d0eaf7c8d2112cd11b8b781f9c3122f319f21b04fb4a05a3facbe726cf5c3e393c11f11f6486299e932b468419c6fd0d6ac6c3e9"

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
