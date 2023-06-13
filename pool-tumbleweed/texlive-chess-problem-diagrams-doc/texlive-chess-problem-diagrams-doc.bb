SUMMARY = "Documentation for texlive-chess-problem-diagrams"
DESCRIPTION = "This package includes the documentation for texlive-chess-problem-diagrams"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.21svn63708"

RPM_NAME = "texlive-chess-problem-diagrams-doc-2023.201.1.21svn63708-53.1.noarch.rpm"
RPM_HASH = "2edb02cf24e27b38f278b9bc2c5030e668fdb40b11e3a33dbaa7b9b3cc9fd56ce8d28b842c4183265a3665bcf0e1cf4f9070fee2f866ea4282360cdb1bd9ea10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chess-problem-diagrams-doc"

RDEPENDS:${PN} += ""

inherit rpm
