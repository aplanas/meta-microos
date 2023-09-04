SUMMARY = "OpenLDAP SQL Back-End"
DESCRIPTION = "The primary purpose of this OpenLDAP backend is to present information \
stored in a Relational (SQL) Database as an LDAP subtree without the need \
to do any programming."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-back-sql-2.6.4-2.2.aarch64.rpm"
RPM_HASH = "ed4ea0574355aa8eae11bc06d0a1fc8415e8cea74a2712373944a2fc8704b9f689c65c2785160993c3b0e56f1f5c2966f29bcc00c86ecbfb9c6e2da73c8ccc1d"

RPROVIDES:${PN} += "openldap2-back-sql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
libodbc.so.2 \
openldap2"

inherit rpm
