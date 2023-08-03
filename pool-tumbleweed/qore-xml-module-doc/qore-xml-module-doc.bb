SUMMARY = "Documentation and examples for the Qore xml module"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
xml module."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "qore-xml-module-doc-1.8.1-1.1.noarch.rpm"
RPM_HASH = "5784f055cb723e655535904ab85328ec9a7e34705c36e368c53f414e36b9e5d293368f892174bc48211c0bceb775ef9569f52f879d8abe47470507a90d48554c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-xml-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
