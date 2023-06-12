SUMMARY = "Documentation for texlive-zennote"
DESCRIPTION = "This package includes the documentation for texlive-zennote"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn65549"

RPM_NAME = "texlive-zennote-doc-2023.201.1.0.0svn65549-52.1.noarch.rpm"
RPM_HASH = "4fd5d540591447b16b9c4eac37eb3cdf7a69adc9a96d2d7ce29b020207f24d2d057ddbe50294c12f0c30cab86d3f2b2017511244d4811ec4e967ef7f030342a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zennote-doc"
RDEPENDS:${PN} += ""

inherit rpm
