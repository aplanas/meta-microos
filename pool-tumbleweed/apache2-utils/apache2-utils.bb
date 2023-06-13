SUMMARY = "The Apache HTTPD Server"
DESCRIPTION = "The Apache HTTP Server Project is an effort to develop and \
maintain an open-source HTTP server for modern operating \
systems including UNIX and Windows. The goal of this project \
is to provide a secure, efficient and extensible server that \
provides HTTP services in sync with the current HTTP standards."
LICENSE = "Apache-2.0"

PV = "2.4.57"

RPM_NAME = "apache2-utils-2.4.57-1.1.aarch64.rpm"
RPM_HASH = "0b856a7dba92069f6b91731e1d4f264c0a2ad6d3d1df12672f449deef67da59893b855bdaab85ee3f11eebf4e5456c6559fce1354780de4384dc9fb8353fafe1"

RPROVIDES:${PN} += "apache2-utils \
apache2-utils(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
/usr/bin/which \
ld-linux-aarch64.so.1()(64bit) \
libapr-1.so.0()(64bit) \
libaprutil-1.so.0()(64bit) \
libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
libcrypto.so.3()(64bit) \
libm.so.6()(64bit) \
libssl.so.3()(64bit)"

inherit rpm
