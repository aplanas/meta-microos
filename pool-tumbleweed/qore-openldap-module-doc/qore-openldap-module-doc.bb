SUMMARY = "Documentation and examples for the Qore openldap module"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
openldap module."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "qore-openldap-module-doc-1.2-1.4.aarch64.rpm"
RPM_HASH = "14227f36bd13ea2d6f590e44ee55c36c6bd8a46499f36653507eac749a4818fa0d33245c63de91c3c253095e5753ebee3af2fb5f0c8441612e4b48b1ed8b0f77"

RPROVIDES:${PN} += "qore-openldap-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
