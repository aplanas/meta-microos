SUMMARY = "Documentation for texlive-pst-layout"
DESCRIPTION = "This package includes the documentation for texlive-pst-layout"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.95svn29803"

RPM_NAME = "texlive-pst-layout-doc-2023.201.0.0.95svn29803-52.1.noarch.rpm"
RPM_HASH = "7419972a45d04c1723d715c8ca1083a36eddfe07bd81cab56721da4677f80027fe260aeb81f20e4486422743b5b36707ef59c7f091a8b53309153c72b3d9555c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-layout-doc"

RDEPENDS:${PN} += ""

inherit rpm
