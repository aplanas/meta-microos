SUMMARY = "HTTP client/server library for GNOME"
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

RPM_NAME = "libsoup-2_4-1-2.74.3-1.3.aarch64.rpm"
RPM_HASH = "070cc7058b29251d65abce415c795644e9e877972bed23322f6ff9573d84693c0ce92f90749d91049e26bc60ff87cc4167a25579bc74db3921aee35d1d8a35e4"

RPROVIDES:${PN} += "libsoup-2-4-1 \
libsoup-2.4.so.1 \
libsoup-gnome-2.4.so.1 \
libsoup2"

RDEPENDS:${PN} += "/sbin/ldconfig \
glib-networking \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgssapi-krb5.so.2 \
libpsl.so.5 \
libsqlite3.so.0 \
libxml2.so.2 \
libz.so.1"

inherit rpm
