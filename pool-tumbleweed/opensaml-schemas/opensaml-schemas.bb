SUMMARY = "OpenSAML schemas and catalog"
DESCRIPTION = "OpenSAML is an open source implementation of the OASIS Security Assertion \
Markup Language Specification. It contains a set of open source C++ classes \
that support the SAML 1.0, 1.1, and 2.0 specifications. \
 \
This package includes XML schemas and related files."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "opensaml-schemas-3.2.1-1.11.aarch64.rpm"
RPM_HASH = "262eaf9e890a421cde7599dce5dc22caa39099eefe300e667cea6568ab7fb0e358cf093f7c8151e8f2fb25ca15dec88a864b454467bb825d4e9c19bd345d6aaa"

RPROVIDES:${PN} += "opensaml-schemas \
opensaml-schemas(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
