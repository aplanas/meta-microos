SUMMARY = "Documentation for texlive-persian-bib"
DESCRIPTION = "This package includes the documentation for texlive-persian-bib"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn37297"

RPM_NAME = "texlive-persian-bib-doc-2023.201.0.0.9svn37297-51.1.noarch.rpm"
RPM_HASH = "8e5d4c1c140a000716940d461632e7a03c45ea11397b29eaf994bee1d3ac6fa1c883cc3ca6fbea5c7ce8066b794891778586b6ed185bce6093ab22bbd021699e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-persian-bib-doc-fa \
texlive-persian-bib-doc"

RDEPENDS:${PN} += ""

inherit rpm
