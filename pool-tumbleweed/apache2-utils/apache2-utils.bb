SUMMARY = "The Apache HTTPD Server"
DESCRIPTION = "The Apache HTTP Server Project is an effort to develop and \
maintain an open-source HTTP server for modern operating \
systems including UNIX and Windows. The goal of this project \
is to provide a secure, efficient and extensible server that \
provides HTTP services in sync with the current HTTP standards."
LICENSE = "Apache-2.0"

PV = "2.4.57"

RPM_NAME = "apache2-utils-2.4.57-2.1.aarch64.rpm"
RPM_HASH = "ddee3baef662a18926decc1c619e84606e08d4215b40a1d1bb0fe5faeae7c974004b6355fc9cca99114163d08f8e42ea13f0b2e5612c4a0f1fbda00c50a65df6"

RPROVIDES:${PN} += "apache2-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/which \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libm.so.6 \
libssl.so.3"

inherit rpm
