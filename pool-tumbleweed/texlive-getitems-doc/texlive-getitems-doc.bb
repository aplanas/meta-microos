SUMMARY = "Documentation for texlive-getitems"
DESCRIPTION = "This package includes the documentation for texlive-getitems"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39365"

RPM_NAME = "texlive-getitems-doc-2023.201.1.0svn39365-52.1.noarch.rpm"
RPM_HASH = "7723f02d46a49da6dd7a4e7d7ca64b71204b4071d9bef6e2190daa8760845649dc976daca9b03e26509255ffea513a618b2adf076b764a7ea1339806d8103959"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-getitems-doc"

RDEPENDS:${PN} += ""

inherit rpm
