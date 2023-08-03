SUMMARY = "Documentation for texlive-biblatex-bookinarticle"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-bookinarticle"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.1asvn40323"

RPM_NAME = "texlive-biblatex-bookinarticle-doc-2023.209.1.3.1asvn40323-54.1.noarch.rpm"
RPM_HASH = "dd158d761d7169dbaf24872c1d1d4b2bc07afb9fea041b2fa9b5a205e1a6a4f6a9daa40c57213ae926430924924b3bac8170f326107b930d36076ca8ff5e2f23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-bookinarticle-doc"

RDEPENDS:${PN} += ""

inherit rpm
