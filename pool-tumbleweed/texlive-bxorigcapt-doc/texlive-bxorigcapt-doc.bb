SUMMARY = "Documentation for texlive-bxorigcapt"
DESCRIPTION = "This package includes the documentation for texlive-bxorigcapt"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn64072"

RPM_NAME = "texlive-bxorigcapt-doc-2023.209.1.0svn64072-53.1.noarch.rpm"
RPM_HASH = "2a64274a5693236b75f7f2761e38c97771b520c5766486896bde67dfd83a4b2b27dff90edf621cac00278b54511b418c2fa3b3b1b40d5567f2c303929100d30d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxorigcapt-doc"

RDEPENDS:${PN} += ""

inherit rpm
