SUMMARY = "Documentation for texlive-pst-spectra"
DESCRIPTION = "This package includes the documentation for texlive-pst-spectra"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.91svn15878"

RPM_NAME = "texlive-pst-spectra-doc-2023.209.0.0.91svn15878-54.1.noarch.rpm"
RPM_HASH = "2c2549584867b20a9f57896224bdd9120e4087d409d8546905e5c44ea8b6f2948aa4360b61edc4627cb5fbf3eeb1eb7be2fc0e09104e9f28a7e8d65ff3bb7def"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-spectra-doc-fr;en \
texlive-pst-spectra-doc"

RDEPENDS:${PN} += ""

inherit rpm
