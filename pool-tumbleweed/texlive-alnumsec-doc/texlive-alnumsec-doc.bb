SUMMARY = "Documentation for texlive-alnumsec"
DESCRIPTION = "This package includes the documentation for texlive-alnumsec"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn15878"

RPM_NAME = "texlive-alnumsec-doc-2023.201.0.0.03svn15878-54.1.noarch.rpm"
RPM_HASH = "ab8ae0a1a49d7ee266c85d2de3c078dc0507e3bd2996a9b2b1dfb0ee0b1216d2c8713ca6c4d8521fffa7f3bfd9dfda755bb12bccca06017c8e4815a250b50cce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alnumsec-doc"

RDEPENDS:${PN} += ""

inherit rpm
