SUMMARY = "A DLZ module which stores zone data in an LDAP directory"
DESCRIPTION = "This package provides the externally loadable ldap DLZ module, without \
update support"
LICENSE = "MPL-2.0"

PV = "9.18.18"

RPM_NAME = "bind-modules-ldap-9.18.18-1.1.aarch64.rpm"
RPM_HASH = "b856c00a6e1bd2a4ffcdc028d1214ab6c3d74fcc7e40eca3fa5193d00445183bebceb8246705e6dfa2cd66a8131b0c5eac46e902d88a1a8976fa032174f262d1"

RPROVIDES:${PN} += "bind-modules-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2"

inherit rpm
