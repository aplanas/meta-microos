SUMMARY = "LDAP database plugin for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of clear text passwords. This package contains the LDAP \
database plugin."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-plugin-kdb-ldap-1.20.1-6.2.aarch64.rpm"
RPM_HASH = "bb11675ba737e1e0c612e25caf0e6a382a4df19ec53f7e7f8d8775ec3e64398dce4086dd19155e4b6e9f3aadde9dfcb4a2cea91a6cbbfb6859de9821d35c49b8"

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
