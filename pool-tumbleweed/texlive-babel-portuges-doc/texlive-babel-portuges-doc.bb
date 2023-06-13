SUMMARY = "Documentation for texlive-babel-portuges"
DESCRIPTION = "This package includes the documentation for texlive-babel-portuges"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2tsvn59883"

RPM_NAME = "texlive-babel-portuges-doc-2023.201.1.2tsvn59883-53.1.noarch.rpm"
RPM_HASH = "65f211442316559f86bbb517c332285f469109de013bc48c9f34c8384ab1056c950371ce1723020db101d06722f12789d32fc1ea5a999a6525c2f2d04b2a8b09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-portuges-doc"

RDEPENDS:${PN} += ""

inherit rpm
