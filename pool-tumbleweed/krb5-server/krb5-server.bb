SUMMARY = "Server program of the MIT Kerberos5 implementation"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes the kdc, kadmind \
and more."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-server-1.20.1-6.2.aarch64.rpm"
RPM_HASH = "fe825aaffc2d605a11d24dd77af37e2560063af8d8b42ecabb7adaa5b0f076ae7bcf82c0ceb7184e26edb3cbb20873b8a32ff2e3c04577b6fb0d10ab7dd445e1"

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
