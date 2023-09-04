SUMMARY = "Documentation for texlive-qtree"
DESCRIPTION = "This package includes the documentation for texlive-qtree"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1bsvn15878"

RPM_NAME = "texlive-qtree-doc-2023.209.3.1bsvn15878-54.2.noarch.rpm"
RPM_HASH = "570c401a1f093211fea901c6f40c698df6d5c6e2b69374061e8f4f83cfd3c1848bc69dea08b85b4b76ca2d7e71e4e5c1a90ed5a027561af674fd9d7bcbf6bd46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-qtree-doc-en \
texlive-qtree-doc"

RDEPENDS:${PN} += ""

inherit rpm
