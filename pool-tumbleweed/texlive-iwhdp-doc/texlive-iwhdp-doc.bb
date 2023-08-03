SUMMARY = "Documentation for texlive-iwhdp"
DESCRIPTION = "This package includes the documentation for texlive-iwhdp"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.50svn37552"

RPM_NAME = "texlive-iwhdp-doc-2023.209.0.0.50svn37552-56.1.noarch.rpm"
RPM_HASH = "6df5bff63b0124b3178f1d5f82d8562896a2dfa4f714fbe2d9e52e7588e433286f2d767219dd0945d3656df25d9ada08c7284d0af78bab4d6286ee8f395624a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-iwhdp-doc-de \
texlive-iwhdp-doc"

RDEPENDS:${PN} += ""

inherit rpm
