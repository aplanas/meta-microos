SUMMARY = "Documentation for texlive-tufte-latex"
DESCRIPTION = "This package includes the documentation for texlive-tufte-latex"
LICENSE = "Apache-1.0"

PV = "2023.209.3.5.2svn37649"

RPM_NAME = "texlive-tufte-latex-doc-2023.209.3.5.2svn37649-53.1.noarch.rpm"
RPM_HASH = "5d28896684879a16e1806bdfa0a2e613e1611a090b9d06cd5aaa8391767f4be88e1d8d7df89d11c608705ebadd573358ee06f601993ca0b3d5be51a5e4e8ee82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tufte-latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
