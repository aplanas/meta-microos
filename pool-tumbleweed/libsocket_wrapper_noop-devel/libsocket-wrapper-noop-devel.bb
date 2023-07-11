SUMMARY = "Development headers for libsocket_wrapper_noop"
DESCRIPTION = "Development headers for applications with the need to call \
socket_wrapper_enabled()."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "libsocket_wrapper_noop-devel-1.4.2-1.1.aarch64.rpm"
RPM_HASH = "771f39e6792e60e849906b8e199c6a76da49ea7f58770df9871f28bed8009af8b35081f58071634c91e099eaacf72cbeadb1216b9349b477b122bec715fa831c"

RPROVIDES:${PN} += "cmake-socket-wrapper \
cmake-socket-wrapper-noop \
libsocket-wrapper-noop-devel \
pkgconfig-socket-wrapper-noop"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsocket-wrapper-noop0"

inherit rpm
