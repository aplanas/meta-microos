SUMMARY = "Documentation for texlive-carbohydrates"
DESCRIPTION = "This package includes the documentation for texlive-carbohydrates"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn39000"

RPM_NAME = "texlive-carbohydrates-doc-2023.209.0.0.1svn39000-53.1.noarch.rpm"
RPM_HASH = "d012096bd6c047f2795a1c1ab9f2d3246465143b5904348971f009db2040649428cfda65c2fe66800627774aa0754be6e6cdb202927c79111fe31f976b4fc7a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-carbohydrates-doc"

RDEPENDS:${PN} += ""

inherit rpm
