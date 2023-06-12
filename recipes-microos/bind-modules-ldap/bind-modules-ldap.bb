SUMMARY = "A DLZ module which stores zone data in an LDAP directory"
DESCRIPTION = "This package provides the externally loadable ldap DLZ module, without \
update support"
LICENSE = "MPL-2.0"

PV = "9.18.15"

RPM_NAME = "bind-modules-ldap-9.18.15-1.1.aarch64.rpm"
RPM_HASH = "7dd159e4a2c2c1a5fbfcc76a15ecbbf8c40464bbdbb44c57c82b911b22f027f78fb84be59658fb92e61aa80ffc93658815d08d3d6b3a7f2175c4532dde2bb080"

RPROVIDES:${PN} += "bind-modules-ldap bind-modules-ldap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit)"

inherit rpm
