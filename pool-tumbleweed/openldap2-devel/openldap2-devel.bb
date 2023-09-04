SUMMARY = "Libraries, Header Files and Documentation for OpenLDAP"
DESCRIPTION = "This package provides the OpenLDAP libraries, header files, and \
documentation."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-devel-2.6.4-2.2.aarch64.rpm"
RPM_HASH = "ebff312eae9de4d5d6f6b134525a3f796ab36ea3dc29feebf9970e2c5d61ff9af82ec9a3601c642215559257ba5dccf9447bf4cb5c727634c7fb8097d04510d3"

RPROVIDES:${PN} += "openldap2-devel \
pkgconfig-lber \
pkgconfig-ldap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libldap2 \
pkgconfig-lber"

inherit rpm
