SUMMARY = "The cyrus-sasl LDAP auxprop plugin"
DESCRIPTION = "The LDAP auxprop plugin allows for tighter application/directory \
integration."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-ldap-auxprop-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "ff4d00e8162d47754f3a4e915e93a3dd14b6bbefb8eb1b8e13b06f44768610767955b38b6eabfa0d0c73699c9879502b2737449f066ea356f7990dd40ee5637f"

RPROVIDES:${PN} += "cyrus-sasl-ldap-auxprop \
cyrus-sasl-ldap-auxprop(aarch-64) \
libldapdb.so.3()(64bit)"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit)"

inherit rpm
