SUMMARY = "Client programs of the MIT Kerberos5 implementation"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes some required \
client programs, like kinit, kadmin, ..."
LICENSE = "MIT"

PV = "1.21.1"

RPM_NAME = "krb5-client-1.21.1-1.1.aarch64.rpm"
RPM_HASH = "d8785ddf009ae79ef85d4054a9a99491e3f0cc2c6587474977864c51a1170a5312fb3aa82c24ac37f06d0fec48cacb8004dd8eb06f67b719d9498318298c7b0c"

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
