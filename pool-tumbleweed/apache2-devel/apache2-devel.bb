SUMMARY = "The Apache HTTPD Server"
DESCRIPTION = "The Apache HTTP Server Project is an effort to develop and \
maintain an open-source HTTP server for modern operating \
systems including UNIX and Windows. The goal of this project \
is to provide a secure, efficient and extensible server that \
provides HTTP services in sync with the current HTTP standards."
LICENSE = "Apache-2.0"

PV = "2.4.57"

RPM_NAME = "apache2-devel-2.4.57-2.1.aarch64.rpm"
RPM_HASH = "6e890830f8d385fba9ace35c6828f849cbe4b43320661844f39977d05a10413ff8c694d550ba3be883670e35179db49bffe865cdb5fdc5c47333ee8e1b972a2c"

RPROVIDES:${PN} += "apache2-devel \
httpd-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
apache2 \
apr-devel \
apr-util-devel \
gcc"

inherit rpm
