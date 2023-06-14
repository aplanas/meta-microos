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

PV = "2.74.3"

RPM_NAME = "libsoup2-devel-2.74.3-1.3.aarch64.rpm"
RPM_HASH = "45a0fe1604a28be88480f1b174eabbb51782f6963d5073e82f9bd1ab0bb7c264d367327e7c32052a71bbfe9067886ad8e900139755902f04419f84823200b8ec"

RPROVIDES:${PN} += "libsoup-doc \
libsoup2-devel \
pkgconfig-libsoup-2.4 \
pkgconfig-libsoup-gnome-2.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsoup-2-4-1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libbrotlidec \
pkgconfig-libpsl \
pkgconfig-libsoup-2.4 \
pkgconfig-libxml-2.0 \
pkgconfig-sqlite3 \
pkgconfig-zlib \
typelib-1-0-Soup-2-4"

inherit rpm
