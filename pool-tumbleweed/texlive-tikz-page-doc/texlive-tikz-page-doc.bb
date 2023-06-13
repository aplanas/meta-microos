SUMMARY = "Documentation for texlive-tikz-page"
DESCRIPTION = "This package includes the documentation for texlive-tikz-page"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn42039"

RPM_NAME = "texlive-tikz-page-doc-2023.201.1.0svn42039-52.1.noarch.rpm"
RPM_HASH = "80c5a11b64036c2ec2408f4685394c1189245da291f31774f1668ccf058f6f11649331b7f953bf73f86f569a6259b43d477d2a3e8bee2897f616d01948824203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-page-doc"

RDEPENDS:${PN} += ""

inherit rpm
