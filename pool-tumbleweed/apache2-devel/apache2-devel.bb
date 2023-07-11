SUMMARY = "The Apache HTTPD Server"
DESCRIPTION = "The Apache HTTP Server Project is an effort to develop and \
maintain an open-source HTTP server for modern operating \
systems including UNIX and Windows. The goal of this project \
is to provide a secure, efficient and extensible server that \
provides HTTP services in sync with the current HTTP standards."
LICENSE = "Apache-2.0"

PV = "2.4.57"

RPM_NAME = "apache2-devel-2.4.57-1.2.aarch64.rpm"
RPM_HASH = "c9430757ef355f8875c488f2cc733a48321b78f7928962737c9775e7c71ff210ae15945ec738a0d9a5e21dc36618c12f954c7e05d8d5a899e6366f868c8571a8"

RPROVIDES:${PN} += "apache2-devel \
httpd-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
apache2 \
apr-devel \
apr-util-devel \
gcc"

inherit rpm
