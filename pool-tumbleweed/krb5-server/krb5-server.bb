SUMMARY = "Server program of the MIT Kerberos5 implementation"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes the kdc, kadmind \
and more."
LICENSE = "MIT"

PV = "1.21.1"

RPM_NAME = "krb5-server-1.21.1-1.1.aarch64.rpm"
RPM_HASH = "97464960339dfdf6e9f9cf8b5cb5e1ab9354ee91b38ada6be98479dba9d04bf2ee3de8f6038f5ade4be23ffdcce34753a9d005ed2d6320f03d992cef2ae9700c"

RPROVIDES:${PN} += "config-krb5-server \
krb5-server"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
cron \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssapi-krb5.so.2 \
libgssrpc.so.4 \
libk5crypto.so.3 \
libkadm5clnt-mit.so.12 \
libkadm5srv-mit.so.12 \
libkdb5.so.10 \
libkrb5.so.3 \
libkrb5support.so.0 \
libss.so.2 \
libverto-libev1 \
libverto.so.1 \
logrotate \
perl-Date-Calc \
systemd"

inherit rpm
