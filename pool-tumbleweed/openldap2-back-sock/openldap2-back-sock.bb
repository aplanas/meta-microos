SUMMARY = "OpenLDAP Socket Back-End"
DESCRIPTION = "The OpenLDAP socket back-end allows you to handle LDAP requests and \
results with an external process listening on a Unix domain socket."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-back-sock-2.6.4-2.1.aarch64.rpm"
RPM_HASH = "3237f58137136c90743109d782af852e6efe392b1fcd3ca428a3ead41745d995cda2f600cb5e3978cce82667c248aff61ad813378b8a0f0653c7b79fd55ee5e0"

RPROVIDES:${PN} += "openldap2-/usr/share/man/man5/slapd-sock.5.gz \
openldap2-back-sock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
openldap2"

inherit rpm
