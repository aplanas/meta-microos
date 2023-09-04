SUMMARY = "A HTTP server and IMAP/POP3 proxy server"
DESCRIPTION = "nginx [engine x] is a HTTP server and IMAP/POP3 proxy server written by Igor Sysoev. \
It has been running on many heavily loaded Russian sites for more than two years."
LICENSE = "BSD-2-Clause"

PV = "1.25.2"

RPM_NAME = "nginx-1.25.2-1.1.aarch64.rpm"
RPM_HASH = "57e50bce2c244c0050bcc053cdc78566392719b5c1a11b47149405336c3d07209058583228b18fb557674e50f4a65cb88cb49c27ccb42f024b22a4eedb31e099"

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
