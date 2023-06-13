SUMMARY = "Documentation for texlive-dutchcal"
DESCRIPTION = "This package includes the documentation for texlive-dutchcal"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54080"

RPM_NAME = "texlive-dutchcal-doc-2023.201.1.0svn54080-52.1.noarch.rpm"
RPM_HASH = "2ddf8cfaf984fd8d38ed5bc5480c4780d4e43535a82447a93c5ea0467aff9fdfff2e911321729e1703dc19245fdb2ba15538ee61ba014a06b1ae672310966541"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dutchcal-doc"

RDEPENDS:${PN} += ""

inherit rpm
