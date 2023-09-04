SUMMARY = "Static libraries for the OpenLDAP libraries"
DESCRIPTION = "This package provides the static versions of the OpenLDAP libraries \
for development."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-devel-static-2.6.4-2.2.aarch64.rpm"
RPM_HASH = "1e31b2846855efb46464e85b08447ad372e119176e0da1c9a2bbd6162682fa199561b1e771c09dcb89bd18a2b629647db0aa70e5a2a76bceeb659f880296eb6f"

RPROVIDES:${PN} += "openldap2-devel-static"

RDEPENDS:${PN} += "cyrus-sasl-devel \
libopenssl-devel \
openldap2-devel"

inherit rpm
