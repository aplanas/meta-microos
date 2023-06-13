SUMMARY = "Documentation for texlive-nowidow"
DESCRIPTION = "This package includes the documentation for texlive-nowidow"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn24066"

RPM_NAME = "texlive-nowidow-doc-2023.201.1.0svn24066-54.1.noarch.rpm"
RPM_HASH = "acfe15e64c6b327ad4b707d49a491ae5510e28738e8a50f3ccbf780636ffbd887f9fefb0ca85b6234a6c3deaf4645566f443898a90acb3df6ba9aff2ca4d553a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nowidow-doc"

RDEPENDS:${PN} += ""

inherit rpm
