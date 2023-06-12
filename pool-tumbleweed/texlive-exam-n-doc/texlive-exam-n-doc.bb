SUMMARY = "Documentation for texlive-exam-n"
DESCRIPTION = "This package includes the documentation for texlive-exam-n"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.0svn64674"

RPM_NAME = "texlive-exam-n-doc-2023.201.1.4.0svn64674-52.1.noarch.rpm"
RPM_HASH = "5336c25bf2f541f11d17594ba98735c62504bde71624960f7d6cddf17e58ece42100dae44f2ba9e8de8376e761035d4f4cbfdcf294cff94c9c1f75ab3fe824ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exam-n-doc"
RDEPENDS:${PN} += ""

inherit rpm
