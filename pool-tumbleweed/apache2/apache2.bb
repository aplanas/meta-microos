SUMMARY = "The Apache HTTPD Server"
DESCRIPTION = "The Apache HTTP Server Project is an effort to develop and \
maintain an open-source HTTP server for modern operating \
systems including UNIX and Windows. The goal of this project \
is to provide a secure, efficient and extensible server that \
provides HTTP services in sync with the current HTTP standards."
LICENSE = "Apache-2.0"

PV = "2.4.57"

RPM_NAME = "apache2-2.4.57-2.1.aarch64.rpm"
RPM_HASH = "da479b84efcbdf364276cd7987ba49c32390dbd1c680ff1a2402b829543a37344f98629de46c3111256ac151e2008f72f4d2153c6bd1c30cbaee598630060c41"

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
