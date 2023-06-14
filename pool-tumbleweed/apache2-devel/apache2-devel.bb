SUMMARY = "The Apache HTTPD Server"
DESCRIPTION = "The Apache HTTP Server Project is an effort to develop and \
maintain an open-source HTTP server for modern operating \
systems including UNIX and Windows. The goal of this project \
is to provide a secure, efficient and extensible server that \
provides HTTP services in sync with the current HTTP standards."
LICENSE = "Apache-2.0"

PV = "2.4.57"

RPM_NAME = "apache2-devel-2.4.57-1.1.aarch64.rpm"
RPM_HASH = "c84a2e39a9c1e39a047f35e65be2cb59b6450777a8119509a168ea62701a5fd45b39575e71c79ea4a4ffe3257524b9a5c2d03621245dec8eac217411c8690891"

RPROVIDES:${PN} += "apache2-devel \
httpd-devel"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
apache2 \
apr-devel \
apr-util-devel \
gcc"

inherit rpm
