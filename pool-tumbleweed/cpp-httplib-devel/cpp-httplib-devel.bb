SUMMARY = "A C++11 HTTP/HTTPS library"
DESCRIPTION = "This is a multi-threaded HTTP library with blocking I/O. There is no \
support for non-blocking mode. \
 \
It features built-in mappings, static file server, pre-routing and \
post-routing handlers, and support for binding sockets to multiple \
interfaces and any available port."
LICENSE = "MIT"

PV = "0.12.5"

RPM_NAME = "cpp-httplib-devel-0.12.5-1.1.aarch64.rpm"
RPM_HASH = "c9a1ff8bd7937403649f44a30ee96d0757decbfed77fb1c9af4a2cce399af382ef0bee134b6d184f56c3c60dc90ea6bf8e1961ff32a3cdaee1a6fbf1ec6277c5"

RPROVIDES:${PN} += "cpp-httplib-devel \
pkgconfig-cpp-httplib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcpp-httplib0-12 \
pkgconfig-libbrotlicommon \
pkgconfig-libbrotlidec \
pkgconfig-libbrotlienc \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
