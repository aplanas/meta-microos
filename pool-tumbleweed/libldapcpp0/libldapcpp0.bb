SUMMARY = "C++ wrapper around openLDAP API"
DESCRIPTION = "This package provides a C++ library for accessing LDAP (Version 3) \
Servers"
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "libldapcpp0-2.6.4-1.1.aarch64.rpm"
RPM_HASH = "7d0dfad3bd39a65eb7f37cc740c4375eb8e3f151829a69f5fc6c28ffb99120a9e120910b1a1e6f20480c8f610b14f3851641f72e2e05d9194feceb587b5e0bdf"

RPROVIDES:${PN} += "ldapcpplib \
libldapcpp.so.0 \
libldapcpp0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblber.so.2 \
libldap.so.2 \
libstdc++.so.6"

inherit rpm
