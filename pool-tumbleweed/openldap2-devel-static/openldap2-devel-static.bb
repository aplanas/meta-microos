SUMMARY = "Static libraries for the OpenLDAP libraries"
DESCRIPTION = "This package provides the static versions of the OpenLDAP libraries \
for development."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-devel-static-2.6.4-1.1.aarch64.rpm"
RPM_HASH = "eff8e46e2d2f509ef994b11811252d4ec53c4ede4cbb5a2d25652e9c0be2eb9e24dac2607e734cbec43c8a29eb1d4b024441676273226645e8d81e53536c62f8"

RPROVIDES:${PN} += "openldap2-devel-static"

RDEPENDS:${PN} += "cyrus-sasl-devel \
libopenssl-devel \
openldap2-devel"

inherit rpm
