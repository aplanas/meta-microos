SUMMARY = "LDAP database plugin for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of clear text passwords. This package contains the LDAP \
database plugin."
LICENSE = "MIT"

PV = "1.21.1"

RPM_NAME = "krb5-plugin-kdb-ldap-1.21.1-1.1.aarch64.rpm"
RPM_HASH = "b8b79e30bc4dadfc12314bc7d81b97c977d5da12ddb7e4fee1679357fcc43f812861957e7f803c69e8f4e19c283c0ab36effd890b2bfa3fc943e2c9fdbac6d40"

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
