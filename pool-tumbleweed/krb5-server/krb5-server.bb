SUMMARY = "Server program of the MIT Kerberos5 implementation"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes the kdc, kadmind \
and more."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-server-1.20.1-6.1.aarch64.rpm"
RPM_HASH = "b6775b827b4ec2ad56a71112bd477b82c23a08b5e8bc0d16161308e50547c790b27bfa9f4fc6dd5d00354579b0e2ad1285008682b65d35654b44f4997708ab28"

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
