SUMMARY = "OpenLDAP SQL Back-End"
DESCRIPTION = "The primary purpose of this OpenLDAP backend is to present information \
stored in a Relational (SQL) Database as an LDAP subtree without the need \
to do any programming."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-back-sql-2.6.4-1.1.aarch64.rpm"
RPM_HASH = "a0a77dcd2e44a415170b5f15dd9f49bdf1c7ad6d8de377ed06df4d5d84cccc0c60c1ca1b7545c69691f8926f2a0c13d1d1bbb070726a9f43406ca66d17f78679"

RPROVIDES:${PN} += "openldap2-back-sql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
libodbc.so.2 \
openldap2"

inherit rpm
