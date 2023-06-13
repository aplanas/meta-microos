SUMMARY = "Documentation for texlive-xecolor"
DESCRIPTION = "This package includes the documentation for texlive-xecolor"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn29660"

RPM_NAME = "texlive-xecolor-doc-2023.201.0.0.1svn29660-52.1.noarch.rpm"
RPM_HASH = "aa8885477cea4e2e2074900756c00538a51b4cb64e6b022ab9e89f539c13d65c4af1ca1f60fdbb609740fcdcb1eebdd8c3eb96bda2d6360b3cf1b03f1de66b4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xecolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
