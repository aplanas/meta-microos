SUMMARY = "A HTTP server and IMAP/POP3 proxy server"
DESCRIPTION = "nginx [engine x] is a HTTP server and IMAP/POP3 proxy server written by Igor Sysoev. \
It has been running on many heavily loaded Russian sites for more than two years."
LICENSE = "BSD-2-Clause"

PV = "1.25.0"

RPM_NAME = "nginx-1.25.0-1.1.aarch64.rpm"
RPM_HASH = "f1e7996a60be43cb94bbb6563fd425eeeb93d2bd0f25688af5e54153713dbaf125fd8920b73a4b0d1835a25824b970f1824f28dee00e6e48bf1eeb74338afa9e"

RPROVIDES:${PN} += "config-nginx \
group-nginx \
http-daemon \
httpd \
nginx \
perl-nginx \
user-nginx"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
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
