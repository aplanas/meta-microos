SUMMARY = "A HTTP server and IMAP/POP3 proxy server"
DESCRIPTION = "nginx [engine x] is a HTTP server and IMAP/POP3 proxy server written by Igor Sysoev. \
It has been running on many heavily loaded Russian sites for more than two years."
LICENSE = "BSD-2-Clause"

PV = "1.25.1"

RPM_NAME = "nginx-1.25.1-1.1.aarch64.rpm"
RPM_HASH = "dc83e721030a12ea7c9dd578c6e7dbfddbf765c412af964221d746b53c60495ad37743bb96f15b9cf07ac0d97ec34c575e6061393b701ae99f933be20c5862f2"

RPROVIDES:${PN} += "config-nginx \
group-nginx \
http-daemon \
httpd \
nginx \
perl-nginx \
user-nginx"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libexslt.so.0 \
libgd.so.3 \
libpcre2-8.so.0 \
libperl.so \
libssl.so.3 \
libxml2.so.2 \
libxslt.so.1 \
libz.so.1 \
perl \
sysuser-shadow"

inherit rpm
