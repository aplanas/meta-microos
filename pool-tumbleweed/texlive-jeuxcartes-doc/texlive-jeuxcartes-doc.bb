SUMMARY = "Documentation for texlive-jeuxcartes"
DESCRIPTION = "This package includes the documentation for texlive-jeuxcartes"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.3svn66190"

RPM_NAME = "texlive-jeuxcartes-doc-2023.209.0.0.2.3svn66190-56.1.noarch.rpm"
RPM_HASH = "1a905b27ca7c4018ed19cd3ff536621abe34c77bd04e2bc101687b523261aa510227fe47fd615746aac28007f5fb4b005a7f04ee2ca71bcff04be4f8c2a83727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jeuxcartes-doc-fr \
texlive-jeuxcartes-doc"

RDEPENDS:${PN} += ""

inherit rpm
