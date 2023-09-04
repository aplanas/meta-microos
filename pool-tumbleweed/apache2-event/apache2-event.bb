SUMMARY = "The Apache HTTPD Server"
DESCRIPTION = "The Apache HTTP Server Project is an effort to develop and \
maintain an open-source HTTP server for modern operating \
systems including UNIX and Windows. The goal of this project \
is to provide a secure, efficient and extensible server that \
provides HTTP services in sync with the current HTTP standards."
LICENSE = "Apache-2.0"

PV = "2.4.57"

RPM_NAME = "apache2-event-2.4.57-2.1.aarch64.rpm"
RPM_HASH = "0b825c9bc04c5df6947c2761ba795c8f0d8875297c48a825b7e954410fd4910d0e0bfa7f4b653a87f8c98704132a4360fda11df13f8df94ea447d635e1c46b9a"

RPROVIDES:${PN} += "apache2-MPM \
apache2-event"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
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
libcurl.so.4 \
libjansson.so.4 \
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
