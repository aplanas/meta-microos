SUMMARY = "A HTTP server and IMAP/POP3 proxy server"
DESCRIPTION = "nginx [engine x] is a HTTP server and IMAP/POP3 proxy server written by Igor Sysoev. \
It has been running on many heavily loaded Russian sites for more than two years."
LICENSE = "BSD-2-Clause"

PV = "1.25.0"

RPM_NAME = "nginx-1.25.0-1.1.aarch64.rpm"
RPM_HASH = "f1e7996a60be43cb94bbb6563fd425eeeb93d2bd0f25688af5e54153713dbaf125fd8920b73a4b0d1835a25824b970f1824f28dee00e6e48bf1eeb74338afa9e"

RPROVIDES:${PN} += "config(nginx) \
group(nginx) \
http_daemon \
httpd \
nginx \
nginx(aarch-64) \
perl(nginx) \
user(nginx)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libexslt.so.0()(64bit) \
libgd.so.3()(64bit) \
libpcre2-8.so.0()(64bit) \
libperl.so()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxslt.so.1()(64bit) \
libxslt.so.1(LIBXML2_1.0.11)(64bit) \
libxslt.so.1(LIBXML2_1.0.18)(64bit) \
libz.so.1()(64bit) \
perl \
sysuser-shadow"

inherit rpm
