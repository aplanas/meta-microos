SUMMARY = "Documentation for texlive-babel-vietnamese"
DESCRIPTION = "This package includes the documentation for texlive-babel-vietnamese"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn39246"

RPM_NAME = "texlive-babel-vietnamese-doc-2023.209.1.4svn39246-54.1.noarch.rpm"
RPM_HASH = "166c99c98116ecbb1dac69c2fdddb787d328ce2ff471664d550117ab01a81a653274c27253102b162acc5d98a4f7f7658057bcee420ccbfc1070ec0979c72178"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-vietnamese-doc"

RDEPENDS:${PN} += ""

inherit rpm
