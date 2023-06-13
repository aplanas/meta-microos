SUMMARY = "A fast, secure, and flexible mailer"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.0"

RPM_NAME = "postfix-3.8.0-2.2.aarch64.rpm"
RPM_HASH = "ef145c4083dacf52f7f090dd7116e1b2378be97137207c8b3ec6bed5bec907d506d26990a6da7201ecff8fa215073f6837b514d1105a36b4c9e1a7d8a873f58b"

RPROVIDES:${PN} += "config(postfix) \
group(maildrop) \
group(postfix) \
libpostfix-dns.so()(64bit) \
libpostfix-global.so()(64bit) \
libpostfix-master.so()(64bit) \
libpostfix-tls.so()(64bit) \
libpostfix-util.so()(64bit) \
postfix \
postfix(aarch-64) \
postfix-lmdb \
smtp_daemon \
user(postfix)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/ed \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
group(mail) \
iproute2 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libicuuc.so.73()(64bit) \
liblmdb-0.9.30.so()(64bit) \
libpcre2-8.so.0()(64bit) \
libsasl2.so.3()(64bit) \
libssl.so.3()(64bit) \
perl \
permissions \
sysuser-shadow \
user(nobody)"

inherit rpm
