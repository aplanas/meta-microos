SUMMARY = "Documentation and examples for the Qore xml module"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
xml module."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "qore-xml-module-doc-1.8.0-1.4.noarch.rpm"
RPM_HASH = "01445929630f02529571535bd21d719819a8f750efd7149f5b96b5f2ba27014f19943f22e6565d6ecd1bb91497160fb4eec0b7ddb7fb82db00d09b99d16641f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-xml-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
