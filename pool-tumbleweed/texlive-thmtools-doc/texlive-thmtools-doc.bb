SUMMARY = "Documentation for texlive-thmtools"
DESCRIPTION = "This package includes the documentation for texlive-thmtools"
LICENSE = "LPPL-1.0"

PV = "2023.209.75svn65863"

RPM_NAME = "texlive-thmtools-doc-2023.209.75svn65863-55.1.noarch.rpm"
RPM_HASH = "facff64b0f1021e3cfb47192ecd171d18f1a4bc74c621ba14e5b410598c86be31473b7c0fa2d4bf16c05eb0f12fe79352bc00cf7acd2f3fd53874551ca6162ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thmtools-doc"

RDEPENDS:${PN} += ""

inherit rpm
