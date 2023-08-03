SUMMARY = "Documentation for texlive-sudoku"
DESCRIPTION = "This package includes the documentation for texlive-sudoku"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-sudoku-doc-2023.209.1.0svn15878-58.1.noarch.rpm"
RPM_HASH = "b44ab16c9f8303ad4f6e960880a7b2ec58ba4eb004df79bf0ea02330369c4037b9ad5889e2d7df2baa163e2df74f48cfda9181ce8b3b81fd0914ee0b41a6a24f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sudoku-doc"

RDEPENDS:${PN} += ""

inherit rpm
