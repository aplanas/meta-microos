SUMMARY = "The Apache HTTPD Server"
DESCRIPTION = "The Apache HTTP Server Project is an effort to develop and \
maintain an open-source HTTP server for modern operating \
systems including UNIX and Windows. The goal of this project \
is to provide a secure, efficient and extensible server that \
provides HTTP services in sync with the current HTTP standards."
LICENSE = "Apache-2.0"

PV = "2.4.57"

RPM_NAME = "apache2-prefork-2.4.57-1.1.aarch64.rpm"
RPM_HASH = "66892664e73093d89588264a5fd9e06b7c1fddc24a4ff6149c705ee4ff810fef27d26a6e6fc907b6ac4364238660c8cacb62027131fd3af18ec0a8efecf389df"

RPROVIDES:${PN} += "apache2-MPM \
apache2-prefork"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
grep \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libbrotlienc.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
liblber.so.2 \
libldap.so.2 \
liblua5.4.so.5 \
libnghttp2.so.14 \
libpcre2-8.so.0 \
libssl.so.3 \
libsystemd.so.0 \
libxml2.so.2 \
libz.so.1 \
permissions \
update-alternatives"

inherit rpm
