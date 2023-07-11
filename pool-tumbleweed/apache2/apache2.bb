SUMMARY = "The Apache HTTPD Server"
DESCRIPTION = "The Apache HTTP Server Project is an effort to develop and \
maintain an open-source HTTP server for modern operating \
systems including UNIX and Windows. The goal of this project \
is to provide a secure, efficient and extensible server that \
provides HTTP services in sync with the current HTTP standards."
LICENSE = "Apache-2.0"

PV = "2.4.57"

RPM_NAME = "apache2-2.4.57-1.2.aarch64.rpm"
RPM_HASH = "95033afa46b2e5532478800c3ba3ac3f13d7d2e66d604bc34146d2dc5e788fb25d3810c7809526f490bf03c3d77e3190488cf0def00a921430bb5025e9ebe3ee"

RPROVIDES:${PN} += "apache-mmn-20120211 \
apache2 \
config-apache2 \
http-daemon \
httpd \
suse-maintenance-mmn-0"

RDEPENDS:${PN} += "/etc/mime.types \
/usr/bin/bash \
/usr/bin/sh \
apache2-MPM \
group-www \
ld-linux-aarch64.so.1 \
libc.so.6 \
logrotate \
user-wwwrun"

inherit rpm
