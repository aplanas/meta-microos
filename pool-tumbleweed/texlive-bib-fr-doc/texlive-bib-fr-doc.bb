SUMMARY = "Documentation for texlive-bib-fr"
DESCRIPTION = "This package includes the documentation for texlive-bib-fr"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn15878"

RPM_NAME = "texlive-bib-fr-doc-2023.209.1.5svn15878-54.1.noarch.rpm"
RPM_HASH = "f746a3e273a140c4209c697011bfd8f008391b751231640b4d8cc5064794017e442bbd56a1351ee7781def28de5b93eac18030c2c79c920e0038c3b06372625d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bib-fr-doc"

RDEPENDS:${PN} += ""

inherit rpm
