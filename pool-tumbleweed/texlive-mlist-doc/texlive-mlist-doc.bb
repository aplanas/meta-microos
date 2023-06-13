SUMMARY = "Documentation for texlive-mlist"
DESCRIPTION = "This package includes the documentation for texlive-mlist"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6asvn15878"

RPM_NAME = "texlive-mlist-doc-2023.201.0.0.6asvn15878-54.1.noarch.rpm"
RPM_HASH = "819e777928d07849e5cc1f134f614d20f0630560a8592f87a86108b06742123619183425d53864ca8fbe460cbf0e9f2aa96e709b5cf4298d63900fa8671309b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
