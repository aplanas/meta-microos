SUMMARY = "OpenLDAP Meta Back-End"
DESCRIPTION = "The OpenLDAP Meta back-end is able to perform basic LDAP proxying with \
respect to a set of remote LDAP servers. The information contained in \
these servers can be presented as belonging to a single Directory \
Information Tree (DIT)."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-back-meta-2.6.4-2.2.aarch64.rpm"
RPM_HASH = "987b37290a453d6e920ae9e2583f2eab5508211d1f54547ca3643159da333bac8ca2aa60094819d25808003f00acd70dc4570d6504434645b80053d1eab6862e"

RPROVIDES:${PN} += "openldap2-/usr/share/man/man5/slapd-meta.5.gz \
openldap2-back-meta"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
openldap2"

inherit rpm
