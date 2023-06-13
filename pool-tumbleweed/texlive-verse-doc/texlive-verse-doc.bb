SUMMARY = "Documentation for texlive-verse"
DESCRIPTION = "This package includes the documentation for texlive-verse"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4bsvn34017"

RPM_NAME = "texlive-verse-doc-2023.201.2.4bsvn34017-53.1.noarch.rpm"
RPM_HASH = "7003e9147e6c8357cbd21cb17e5a24923e518c44830888fe0181c67056cbab8531c9c7c3034e137ef9a40f3b637418da3865854178d21248421de127c4c4f063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verse-doc"

RDEPENDS:${PN} += ""

inherit rpm
