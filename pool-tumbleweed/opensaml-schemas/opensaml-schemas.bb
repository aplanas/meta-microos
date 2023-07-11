SUMMARY = "OpenSAML schemas and catalog"
DESCRIPTION = "OpenSAML is an open source implementation of the OASIS Security Assertion \
Markup Language Specification. It contains a set of open source C++ classes \
that support the SAML 1.0, 1.1, and 2.0 specifications. \
 \
This package includes XML schemas and related files."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "opensaml-schemas-3.2.1-1.12.aarch64.rpm"
RPM_HASH = "e30c793c17c801f63e0ff64e3adc4c5d943351e957313b74f4c5a0d4731123509899ff74e60d0c6480a774893404d20e2cc57ebff3e6a7f3d7369de5d0f395ed"

RPROVIDES:${PN} += "opensaml-schemas"

RDEPENDS:${PN} += ""

inherit rpm
