SUMMARY = "OpenLDAP Socket Back-End"
DESCRIPTION = "The OpenLDAP socket back-end allows you to handle LDAP requests and \
results with an external process listening on a Unix domain socket."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-back-sock-2.6.4-2.2.aarch64.rpm"
RPM_HASH = "f6d54300a27029301c5fa7e9dcc686a0434df3106f596061021c0ad4a2908f63a3f01fa696b64bf522ed20afcc15e44790dbafbf20722fd7a38bdcca556ca836"

RPROVIDES:${PN} += "openldap2-/usr/share/man/man5/slapd-sock.5.gz \
openldap2-back-sock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
openldap2"

inherit rpm
