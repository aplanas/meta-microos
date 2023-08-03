SUMMARY = "Documentation for texlive-listofsymbols"
DESCRIPTION = "This package includes the documentation for texlive-listofsymbols"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn16134"

RPM_NAME = "texlive-listofsymbols-doc-2023.209.0.0.2svn16134-55.1.noarch.rpm"
RPM_HASH = "39042d586c19c59437e6af6310e70b99b72857bb1c6e1b5dc86c1870442224ab76be3269d71824667fe30b6e8af4eb341930c36debd54295c78a6d7fb24320a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listofsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
