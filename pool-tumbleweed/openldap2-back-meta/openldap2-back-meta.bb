SUMMARY = "OpenLDAP Meta Back-End"
DESCRIPTION = "The OpenLDAP Meta back-end is able to perform basic LDAP proxying with \
respect to a set of remote LDAP servers. The information contained in \
these servers can be presented as belonging to a single Directory \
Information Tree (DIT)."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-back-meta-2.6.4-2.1.aarch64.rpm"
RPM_HASH = "073c8d7985df3b793a7a0dc2c515e4d06be3df6b32856c4d2257e787f1aae6c1b8c0656abd4dae411346e18123710af71066d427563af4d5e842cf63a45748a6"

RPROVIDES:${PN} += "openldap2-/usr/share/man/man5/slapd-meta.5.gz \
openldap2-back-meta"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
openldap2"

inherit rpm
