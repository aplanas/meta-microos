SUMMARY = "Documentation for texlive-bibleref-lds"
DESCRIPTION = "This package includes the documentation for texlive-bibleref-lds"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn25526"

RPM_NAME = "texlive-bibleref-lds-doc-2023.201.1.0svn25526-53.1.noarch.rpm"
RPM_HASH = "d2f983936ecd9a4e16047d5204da69da5a749cc592a48344f8a880568c52337e700b92d9368d68244b851238727d5704a81c29e05efae6c21fbf6d764227d23c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibleref-lds-doc"

RDEPENDS:${PN} += ""

inherit rpm
