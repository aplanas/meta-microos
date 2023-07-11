SUMMARY = "Documentation for texlive-elmath"
DESCRIPTION = "This package includes the documentation for texlive-elmath"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-elmath-doc-2023.201.1.2svn15878-53.2.noarch.rpm"
RPM_HASH = "b5d0c87be680adf086bf8a656e40645be8e88579b59ab481d14b0516a59d7b735e8709661f29ecda4925189439e3b3f85be4bd6192790e621cc37b77398f14d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
