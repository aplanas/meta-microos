SUMMARY = "LDAP database plugin for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of clear text passwords. This package contains the LDAP \
database plugin."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-plugin-kdb-ldap-1.20.1-6.1.aarch64.rpm"
RPM_HASH = "741e26e70f73a7752e8e08932c943019a498cca401c44fcb0e7f0ec0c8ccf6923833ecc50acab0e89f54aaf68871b32c5e84a8b915015f7c28b810eb20911fd4"

RPROVIDES:${PN} += "config-krb5-plugin-kdb-ldap \
krb5-plugin-kdb-ldap \
libkdb-ldap.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
krb5-server \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssrpc.so.4 \
libk5crypto.so.3 \
libkadm5srv-mit.so.12 \
libkdb5.so.10 \
libkrb5.so.3 \
libkrb5support.so.0 \
libldap.so.2"

inherit rpm
