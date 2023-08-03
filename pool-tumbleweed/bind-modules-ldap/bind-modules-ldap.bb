SUMMARY = "A DLZ module which stores zone data in an LDAP directory"
DESCRIPTION = "This package provides the externally loadable ldap DLZ module, without \
update support"
LICENSE = "MPL-2.0"

PV = "9.18.17"

RPM_NAME = "bind-modules-ldap-9.18.17-1.1.aarch64.rpm"
RPM_HASH = "94317f550b3ac71cd60b78aae5ecbcdba36394dcc082b70487a249cfa30fd931d4d45e2ac8cff8a874932ac26ee22c329721dc652b49b9000f8f02fa162f7826"

RPROVIDES:${PN} += "bind-modules-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2"

inherit rpm
