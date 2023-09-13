SUMMARY = "Development headers for libsocket_wrapper_noop"
DESCRIPTION = "Development headers for applications with the need to call \
socket_wrapper_enabled()."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "libsocket_wrapper_noop-devel-1.4.2-2.1.aarch64.rpm"
RPM_HASH = "653d146f83dedbf31590981895022c6c72cd0fb4064246228bf55371b62ab3def61b417d662b64e1a60ec956d2b095d08c494310d27faebd44e5e862e7a63145"

RPROVIDES:${PN} += "cmake-socket-wrapper \
cmake-socket-wrapper-noop \
libsocket-wrapper-noop-devel \
pkgconfig-socket-wrapper-noop"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsocket-wrapper-noop0"

inherit rpm
