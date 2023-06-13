SUMMARY = "Documentation for texlive-romannum"
DESCRIPTION = "This package includes the documentation for texlive-romannum"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0bsvn15878"

RPM_NAME = "texlive-romannum-doc-2023.201.1.0bsvn15878-53.1.noarch.rpm"
RPM_HASH = "3f540d3eafa2fefdf2ae2b114bd1c0d0a5608e64019bc672403a0687f5aeb42a1824066f4258112d93053f1f7c78357def3465c87648452576f5b21de4de17b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-romannum-doc"

RDEPENDS:${PN} += ""

inherit rpm
