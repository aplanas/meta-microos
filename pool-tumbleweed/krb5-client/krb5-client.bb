SUMMARY = "Client programs of the MIT Kerberos5 implementation"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes some required \
client programs, like kinit, kadmin, ..."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-client-1.20.1-6.1.aarch64.rpm"
RPM_HASH = "99bdf1fa951f65ce325b6f7affab6db897376b64e4f06b693845dc5767a9f8e548b71e586785030a0a89699d7cfcae28e25927dbb837e9c2724005f813ac860e"

RPROVIDES:${PN} += "krb5-client"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssapi-krb5.so.2 \
libk5crypto.so.3 \
libkadm5clnt-mit.so.12 \
libkadm5srv-mit.so.12 \
libkdb5.so.10 \
libkrb5.so.3 \
libkrb5support.so.0 \
libpam.so.0 \
libss.so.2"

inherit rpm
