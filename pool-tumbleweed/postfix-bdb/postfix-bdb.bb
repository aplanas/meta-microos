SUMMARY = "A fast, secure, and flexible mailer"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program with bdb support"
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.0"

RPM_NAME = "postfix-bdb-3.8.0-2.2.aarch64.rpm"
RPM_HASH = "8a17e282b52f91419ecfa00d352dcd4242bab2606606679a8664c6de5932ddc484e23b8cc15d0ee7b37a14de74b35d35400d672487cb35b76498193b06420f2f"

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

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
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
