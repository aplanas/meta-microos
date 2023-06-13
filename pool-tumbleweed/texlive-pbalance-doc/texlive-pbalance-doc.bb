SUMMARY = "Documentation for texlive-pbalance"
DESCRIPTION = "This package includes the documentation for texlive-pbalance"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.0svn64002"

RPM_NAME = "texlive-pbalance-doc-2023.201.1.4.0svn64002-51.1.noarch.rpm"
RPM_HASH = "628c891933bdf28ff941e64fb7ba95fbac647a4c7b3b27085b9b8a3976d3d5daa864cb241b37c1b8b091c453702b7ca86f18c3ca3418a1bed4c369ff610d64b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pbalance-doc"

RDEPENDS:${PN} += ""

inherit rpm
