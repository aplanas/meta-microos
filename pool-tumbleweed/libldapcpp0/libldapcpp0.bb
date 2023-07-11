SUMMARY = "C++ wrapper around openLDAP API"
DESCRIPTION = "This package provides a C++ library for accessing LDAP (Version 3) \
Servers"
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "libldapcpp0-2.6.4-2.1.aarch64.rpm"
RPM_HASH = "4b5a794c98a01800c99a65dea4a8524d3cdce287a3679164741b9d3030ad5e59b979771da719ed07f98e5de1eb6af74deadbacfa91e17a68dac40c4d071e5b7c"

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
