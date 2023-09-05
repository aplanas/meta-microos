SUMMARY = "A fast, secure, and flexible mailer"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.1"

RPM_NAME = "postfix-3.8.1-2.1.aarch64.rpm"
RPM_HASH = "f023c3206701aaadbde91e23ad87306ad9d3083e7aeb14ba1a01fd94491d1aafc73b9d13e58ae06c931c16331a6b0666368c682da6b25864f01d37789859234a"

RPROVIDES:${PN} += "config-postfix \
group-maildrop \
group-postfix \
libpostfix-dns.so \
libpostfix-global.so \
libpostfix-master.so \
libpostfix-tls.so \
libpostfix-util.so \
postfix \
postfix-lmdb \
smtp-daemon \
user-postfix"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/ed \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-mail \
iproute2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libicuuc.so.73 \
liblmdb-0.9.30.so \
libpcre2-8.so.0 \
libsasl2.so.3 \
libssl.so.3 \
perl \
permissions \
sysuser-shadow \
user-nobody"

inherit rpm
