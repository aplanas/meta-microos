SUMMARY = "Documentation for texlive-lipsum"
DESCRIPTION = "This package includes the documentation for texlive-lipsum"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn60561"

RPM_NAME = "texlive-lipsum-doc-2023.209.2.7svn60561-55.1.noarch.rpm"
RPM_HASH = "08c282c4985797406e4b609308316abf263403a8c63411c7091054dd6c8f6f3d2b8bf02acc4aa7157f03d109e4df3c22af6503e5b5c5386898d717ef6c0f2e27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
