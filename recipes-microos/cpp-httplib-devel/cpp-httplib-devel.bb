SUMMARY = "A C++11 HTTP/HTTPS library"
DESCRIPTION = "This is a multi-threaded HTTP library with blocking I/O. There is no \
support for non-blocking mode. \
 \
It features built-in mappings, static file server, pre-routing and \
post-routing handlers, and support for binding sockets to multiple \
interfaces and any available port."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "cpp-httplib-devel-0.12.0-1.3.aarch64.rpm"
RPM_HASH = "aba220782fb9c6d08e3b26257c38ff9b921a3ad0406e9ff47b8b4782f03da40f572046db77d1402111b2233b48e230bbb472f869f4594b3c4a41a1c74d64087e"

RPROVIDES:${PN} += "cpp-httplib-devel cpp-httplib-devel(aarch-64) pkgconfig(cpp-httplib)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcpp-httplib0_12 pkgconfig(libbrotlicommon) pkgconfig(libbrotlidec) pkgconfig(libbrotlienc) pkgconfig(openssl) pkgconfig(zlib)"

inherit rpm
