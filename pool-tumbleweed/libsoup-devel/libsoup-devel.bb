SUMMARY = "HTTP client/server library for GNOME - Development Files"
DESCRIPTION = "Libsoup is an HTTP client/server library for GNOME. It uses GObjects \
and the glib main loop, to integrate well with GNOME applications. \
 \
Features: \
  * Both asynchronous (GMainLoop and callback-based) and synchronous APIs \
  * Automatically caches connections \
  * SSL Support using GnuTLS \
  * Proxy support, including authentication and SSL tunneling \
  * Client support for Digest, NTLM, and Basic authentication \
  * Server support for Digest and Basic authentication \
  * XML-RPC support"
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.2"

RPM_NAME = "libsoup-devel-3.4.2-1.1.aarch64.rpm"
RPM_HASH = "577a096b4deea14a5ba3c45db3d037615bc2e236a9cb413ece48366a840c05fb49166c3389f81614de82bdf41c04714540d96c073c8b70a406cf0e4fbed1ff6d"

RPROVIDES:${PN} += "libsoup-devel \
libsoup-doc \
pkgconfig-libsoup-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsoup-3-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libbrotlidec \
pkgconfig-libnghttp2 \
pkgconfig-libpsl \
pkgconfig-sqlite3 \
pkgconfig-zlib \
typelib-1-0-Soup-3-0"

inherit rpm
