SUMMARY = "A DLZ module which stores zone data in an LDAP directory"
DESCRIPTION = "This package provides the externally loadable ldap DLZ module, without \
update support"
LICENSE = "MPL-2.0"

PV = "9.18.14"

RPM_NAME = "bind-modules-ldap-9.18.14-1.1.aarch64.rpm"
RPM_HASH = "838bf7c2b7e143c3bfb93132ac62e23b187433d0c59d361caff86a0114feb7fd17e59f15d46c8024432a906828f77d6bb293c9e69b98873155a888956d7914cf"

RPROVIDES:${PN} += "bind-modules-ldap bind-modules-ldap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit)"

inherit rpm
