SUMMARY = "Documentation for texlive-lcyw"
DESCRIPTION = "This package includes the documentation for texlive-lcyw"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-lcyw-doc-2023.209.1.1svn15878-55.1.noarch.rpm"
RPM_HASH = "9217db2df42a61afed9af00caae802b0f4fbd7e25d4c3b5ab64269fd067e297df7aa086ac937345a0a21ab5147f83105e608c041ceba9f633c88629d0a38dd59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lcyw-doc"

RDEPENDS:${PN} += ""

inherit rpm
