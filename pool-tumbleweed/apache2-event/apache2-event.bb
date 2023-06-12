SUMMARY = "The Apache HTTPD Server"
DESCRIPTION = "The Apache HTTP Server Project is an effort to develop and \
maintain an open-source HTTP server for modern operating \
systems including UNIX and Windows. The goal of this project \
is to provide a secure, efficient and extensible server that \
provides HTTP services in sync with the current HTTP standards."
LICENSE = "Apache-2.0"

PV = "2.4.57"

RPM_NAME = "apache2-event-2.4.57-1.1.aarch64.rpm"
RPM_HASH = "54f95da5fa98e9a2393c4ee8c63e05a887b571a3e45c9a9a22cb97e2615eed0c6462abdaf0ebf8f000a0f4b8778fb73cf465b96c5bae4238c965c6ffa9937459"

RPROVIDES:${PN} += "apache2-MPM \
apache2-event \
apache2-event(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
grep \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libapr-1.so.0()(64bit) \
libaprutil-1.so.0()(64bit) \
libbrotlienc.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
liblua5.4.so.5()(64bit) \
libnghttp2.so.14()(64bit) \
libpcre2-8.so.0()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.2)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libz.so.1()(64bit) \
permissions \
update-alternatives"

inherit rpm