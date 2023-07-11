SUMMARY = "Documentation for texlive-hexboard"
DESCRIPTION = "This package includes the documentation for texlive-hexboard"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn62102"

RPM_NAME = "texlive-hexboard-doc-2023.201.1.0svn62102-53.2.noarch.rpm"
RPM_HASH = "0c4556271889dd2e001e0b9796e997df030826d92040c8096fcd088e192f4d8b77f76dd4aadde88777c17796d0b6ff0f423523c0e0586325e7de2fdc6c9cf929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hexboard-doc"

RDEPENDS:${PN} += ""

inherit rpm
