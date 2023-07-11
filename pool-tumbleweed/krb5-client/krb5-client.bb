SUMMARY = "Client programs of the MIT Kerberos5 implementation"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes some required \
client programs, like kinit, kadmin, ..."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-client-1.20.1-6.2.aarch64.rpm"
RPM_HASH = "7b0d7128a4767ed6b946f56a42c93f577aa5486182a73cc7f30f5ba8278eb4657269e0fa76ed0fc74b6e47817042c08254f887bc426b7273ff2033fa892c9a4c"

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
