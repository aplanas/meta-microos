SUMMARY = "Documentation for texlive-francais-bst"
DESCRIPTION = "This package includes the documentation for texlive-francais-bst"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn38922"

RPM_NAME = "texlive-francais-bst-doc-2023.209.1.1svn38922-53.1.noarch.rpm"
RPM_HASH = "12091949581e0766cb3125eded212fdc7820ccb8701792fce324ee812bd9be0f4d75ac905b6a8c6f2103f0aed6d33d4e560a47fe182a3c70065463cbb07de4dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-francais-bst-doc-fr \
texlive-francais-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
