SUMMARY = "Documentation for texlive-hyph-utf8"
DESCRIPTION = "This package includes the documentation for texlive-hyph-utf8"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61719"

RPM_NAME = "texlive-hyph-utf8-doc-2023.201.svn61719-52.1.noarch.rpm"
RPM_HASH = "8dac2ab64b2a5f9b9226890edb7a517ed4d89efbf01643805ef645f067de808962962755b1c6aa945cb9cbd3573c39fc8eb8d920d109d4e5d6490a7f48c15ae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-hyph-utf8-doc:en) \
texlive-hyph-utf8-doc"

RDEPENDS:${PN} += ""

inherit rpm
