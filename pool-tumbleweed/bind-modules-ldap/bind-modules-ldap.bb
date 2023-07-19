SUMMARY = "A DLZ module which stores zone data in an LDAP directory"
DESCRIPTION = "This package provides the externally loadable ldap DLZ module, without \
update support"
LICENSE = "MPL-2.0"

PV = "9.18.16"

RPM_NAME = "bind-modules-ldap-9.18.16-3.1.aarch64.rpm"
RPM_HASH = "fe95a65915be6a72862ea43450a20983bfabe0a16a17bb88e06d7bd9c95cd5dedc18dab6386e33f8a72aa215c3ebe9fe46b0f6633f446f02339e3fad4df58e3a"

RPROVIDES:${PN} += "bind-modules-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2"

inherit rpm
