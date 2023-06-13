SUMMARY = "The cyrus-sasl LDAP auxprop plugin"
DESCRIPTION = "The LDAP auxprop plugin allows for tighter application/directory \
integration."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-ldap-auxprop-bdb-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "5349a995703601ca110a320597c13c2594bb1e38eddfcfc226a67be3a5ba67aa2808a5619746fc5797d9b72ef05115119ff48e0a8089581484632112db1655d1"

RPROVIDES:${PN} += "cyrus-sasl-ldap-auxprop-bdb \
cyrus-sasl-ldap-auxprop-bdb(aarch-64) \
libldapdb.so.3()(64bit)"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblber.so.2()(64bit) \
libldap.so.2()(64bit)"

inherit rpm
