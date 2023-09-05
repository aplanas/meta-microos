SUMMARY = "A fast, secure, and flexible mailer"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program with bdb support"
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.1"

RPM_NAME = "postfix-bdb-3.8.1-2.1.aarch64.rpm"
RPM_HASH = "2053eb03dc6933d159d6002c151793039dfe9d2a8c931c81d869f32e060507ae246ff9c14d04599d3c76aad2b3754d32e85184d5f08183658e57ea2dab9010e9"

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
