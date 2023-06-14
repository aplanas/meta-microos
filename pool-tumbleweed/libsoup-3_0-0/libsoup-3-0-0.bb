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

PV = "3.4.2"

RPM_NAME = "libsoup-3_0-0-3.4.2-1.1.aarch64.rpm"
RPM_HASH = "9e3f92c7af6614962ee393f2559db0a6c8692d32a3f7d80ba5b70055cecff5ff929e0234a7853b7bbf0364118b9f5b4f55f55afc197502438ec512e648aebe19"

RPROVIDES:${PN} += "libsoup \
libsoup-3-0-0 \
libsoup-3.0.so.0"

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
libnghttp2.so.14 \
libpsl.so.5 \
libsqlite3.so.0 \
libz.so.1"

inherit rpm
