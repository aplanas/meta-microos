SUMMARY = "OpenLDAP SQL Back-End"
DESCRIPTION = "The primary purpose of this OpenLDAP backend is to present information \
stored in a Relational (SQL) Database as an LDAP subtree without the need \
to do any programming."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-back-sql-2.6.4-2.1.aarch64.rpm"
RPM_HASH = "c815072463fad4b7841bdc08b45134aa05ea886da7450ed3a1b79ed812a06432994fe205d3a058f46e15d7572486b06d27de4b4d14f10675ccb37146807f043c"

RPROVIDES:${PN} += "openldap2-back-sql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
libodbc.so.2 \
openldap2"

inherit rpm
