SUMMARY = "Documentation for texlive-xepersian"
DESCRIPTION = "This package includes the documentation for texlive-xepersian"
LICENSE = "LPPL-1.0"

PV = "2023.201.24.8svn64872"

RPM_NAME = "texlive-xepersian-doc-2023.201.24.8svn64872-52.2.noarch.rpm"
RPM_HASH = "e8895194a4689affedf9f5a0f1e3dcc56069a6107458efb3bfe1bf2eb05ce527e48ca5a132939575dd04be8248eee25f65f694b0a2dca1b0cb5db35f172b27f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xepersian-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
