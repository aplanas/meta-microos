SUMMARY = "Documentation for texlive-edmargin"
DESCRIPTION = "This package includes the documentation for texlive-edmargin"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn27599"

RPM_NAME = "texlive-edmargin-doc-2023.201.1.2svn27599-53.2.noarch.rpm"
RPM_HASH = "b7fbe067e1adb848edae0604b805ea209a039f1c474a9e336229d198081735ecc9f6674d3c616e09313bfebaca2aa8bc8f957a720987ba84d561f0cfd005aea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edmargin-doc"

RDEPENDS:${PN} += ""

inherit rpm
