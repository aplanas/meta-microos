SUMMARY = "A fast, secure, and flexible mailer"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program with bdb support"
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.1"

RPM_NAME = "postfix-bdb-3.8.1-1.1.aarch64.rpm"
RPM_HASH = "20d773eb983c7166e31b1150033b018ffa01a63b442c24d249f50eec90066c0ccd16a0757aaf902028a34f9b86cfc2f035a9c772c196f26e74af7a0afb2f0f4a"

RPROVIDES:${PN} += "config-postfix-bdb \
group-maildrop \
group-postfix \
libpostfix-dns.so \
libpostfix-global.so \
libpostfix-master.so \
libpostfix-tls.so \
libpostfix-util.so \
postfix-bdb \
smtp-daemon \
user-postfix"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
ed \
fillup \
group-mail \
iproute2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdb-4.8.so \
libicuuc.so.73 \
libpcre2-8.so.0 \
libsasl2.so.3 \
libssl.so.3 \
perl \
permissions \
sysuser-shadow \
user-nobody"

inherit rpm
