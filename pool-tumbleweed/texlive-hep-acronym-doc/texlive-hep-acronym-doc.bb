SUMMARY = "Documentation for texlive-hep-acronym"
DESCRIPTION = "This package includes the documentation for texlive-hep-acronym"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64890"

RPM_NAME = "texlive-hep-acronym-doc-2023.201.1.1svn64890-53.2.noarch.rpm"
RPM_HASH = "5aaa5d9549be6fed7929dd29a18e65c20db866d247535fd68e81ab178a244f18127289f68d872f3b5001e66d112d1cbfe6bd5e0a74e346805c15915d914daa90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-acronym-doc"

RDEPENDS:${PN} += ""

inherit rpm
