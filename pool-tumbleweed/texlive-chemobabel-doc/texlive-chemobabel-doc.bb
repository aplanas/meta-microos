SUMMARY = "Documentation for texlive-chemobabel"
DESCRIPTION = "This package includes the documentation for texlive-chemobabel"
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.9lsvn64778"

RPM_NAME = "texlive-chemobabel-doc-2023.201.0.0.9lsvn64778-53.1.noarch.rpm"
RPM_HASH = "d05d5bd13a948adaabcdc1da19b6dea6431fc809ca0acfb3450378cebd4330478ab7cf18d431d7a8e336ccd16cea1421889a6622ea8876c6413dc8b47cd53e75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-chemobabel-doc:en;ja) \
texlive-chemobabel-doc"

RDEPENDS:${PN} += ""

inherit rpm
