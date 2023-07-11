SUMMARY = "The cyrus-sasl LDAP auxprop plugin"
DESCRIPTION = "The LDAP auxprop plugin allows for tighter application/directory \
integration."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-ldap-auxprop-2.1.28-5.2.aarch64.rpm"
RPM_HASH = "4e1e25c5a0914df88024ef44f2472a9817db6a18225d17229b74670e823c3573f51b5a2a81842098d9368ad8c9cc33cc6571b356a3f39d0b813e54b07fe079c8"

RPROVIDES:${PN} += "cyrus-sasl-ldap-auxprop \
libldapdb.so.3"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2"

inherit rpm
