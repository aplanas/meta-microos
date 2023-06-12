SUMMARY = "Documentation for texlive-thaienum"
DESCRIPTION = "This package includes the documentation for texlive-thaienum"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn44140"

RPM_NAME = "texlive-thaienum-doc-2023.201.0.0.2svn44140-54.1.noarch.rpm"
RPM_HASH = "ff08f1c6816b83579b7164496fbf6370656554295f731bfd2330ee0dc27b0e337efae16c7ef38536a14a82d285cecd62357defc829c4676702a946f54c1a2b92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thaienum-doc"
RDEPENDS:${PN} += ""

inherit rpm
