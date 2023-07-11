SUMMARY = "A DLZ module which stores zone data in an LDAP directory"
DESCRIPTION = "This package provides the externally loadable ldap DLZ module, without \
update support"
LICENSE = "MPL-2.0"

PV = "9.18.16"

RPM_NAME = "bind-modules-ldap-9.18.16-2.1.aarch64.rpm"
RPM_HASH = "a9ab238f826837f12684dbf87f552ff06216185b49bd5b12ec4a4f49cb591d7402fa2110523e177724f9901eb06d0c20342e70d9258c40fefe80d412c76c4f2e"

RPROVIDES:${PN} += "bind-modules-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2"

inherit rpm
