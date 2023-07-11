SUMMARY = "The cyrus-sasl LDAP auxprop plugin"
DESCRIPTION = "The LDAP auxprop plugin allows for tighter application/directory \
integration."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-ldap-auxprop-bdb-2.1.28-5.2.aarch64.rpm"
RPM_HASH = "568b3534b7854923dbdf683d6e9ab17859187c8ed88200063e13711caa6b70f4e2a12e355364cd59d4282505b6c28ee70f6ccbe46fe2fb8f52c75b5be845bb7f"

RPROVIDES:${PN} += "cyrus-sasl-ldap-auxprop-bdb \
libldapdb.so.3"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2"

inherit rpm
