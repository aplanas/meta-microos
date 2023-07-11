SUMMARY = "MIT Kerberos5 implementation"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of clear text passwords."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-1.20.1-6.2.aarch64.rpm"
RPM_HASH = "ab99de7aae61bb139476db55e935f3db268a0b73b5b5f00a1439b47bf31d68afec3708dc898a1af62c2745abe62141a5c4f8b3ad8d9f29f1173ea25cca249d09"

RPROVIDES:${PN} += "config-krb5 \
krb5 \
libgssapi-krb5.so.2 \
libgssrpc.so.4 \
libk5crypto.so.3 \
libkadm5clnt-mit.so.12 \
libkadm5srv-mit.so.12 \
libkdb5.so.10 \
libkrad.so.0 \
libkrb5.so.3 \
libkrb5support.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcrypto.so.3 \
libkeyutils.so.1 \
libresolv.so.2 \
libselinux.so.1 \
libssl.so.3 \
libverto.so.1"

inherit rpm
