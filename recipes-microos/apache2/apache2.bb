SUMMARY = "The Apache HTTPD Server"
DESCRIPTION = "The Apache HTTP Server Project is an effort to develop and \
maintain an open-source HTTP server for modern operating \
systems including UNIX and Windows. The goal of this project \
is to provide a secure, efficient and extensible server that \
provides HTTP services in sync with the current HTTP standards."
LICENSE = "Apache-2.0"

PV = "2.4.57"

RPM_NAME = "apache2-2.4.57-1.1.aarch64.rpm"
RPM_HASH = "206d09bd1d6aab325b6e5e3eba158684522a02bfc7e981ac074da492021ced17722e3711b980659e940e423d154b0965929ba2763f22075fe1bb23cf11931c85"

RPROVIDES:${PN} += "apache2 apache2(aarch-64) apache_mmn_20120211 config(apache2) http_daemon httpd suse_maintenance_mmn_0"
RDEPENDS:${PN} += "/bin/bash /bin/sh /etc/mime.types apache2-MPM group(www) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) logrotate user(wwwrun)"

inherit rpm
