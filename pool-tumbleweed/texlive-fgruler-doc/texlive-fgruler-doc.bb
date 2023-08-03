SUMMARY = "Documentation for texlive-fgruler"
DESCRIPTION = "This package includes the documentation for texlive-fgruler"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn63721"

RPM_NAME = "texlive-fgruler-doc-2023.209.1.5svn63721-53.1.noarch.rpm"
RPM_HASH = "2432264956358f64442e61fa5c3abcbfe2725c8bafdb169f4e4be6aad3af0a5282c72674b84656786d857c072b471a95e77f77356762817dee84d20714f0b924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fgruler-doc"

RDEPENDS:${PN} += ""

inherit rpm
