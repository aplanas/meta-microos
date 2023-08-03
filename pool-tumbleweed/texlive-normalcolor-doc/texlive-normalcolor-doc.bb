SUMMARY = "Documentation for texlive-normalcolor"
DESCRIPTION = "This package includes the documentation for texlive-normalcolor"
LICENSE = "LPPL-1.0"

PV = "2023.209.r11svn40125"

RPM_NAME = "texlive-normalcolor-doc-2023.209.r11svn40125-55.1.noarch.rpm"
RPM_HASH = "87eb15841ba6eda2e144781ed5eb7d7562252d96dbba3989dfda21755231432735d2e885cd6879e4c2d636c89d4b124c765529cefecabfbc6d6a3879cd64f1c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-normalcolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
