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

RPM_NAME = "libsoup-2_4-1-2.74.3-1.4.aarch64.rpm"
RPM_HASH = "e948b3c43c1a7940436b50e8bf0b34b8253825465a5e8422f7a9bc436d29c98bc39aaf635edd75ae971092b7a67173dbfc392d390bc305b038987552bd6593c8"

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
