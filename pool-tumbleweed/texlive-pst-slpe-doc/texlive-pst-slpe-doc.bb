SUMMARY = "Documentation for texlive-pst-slpe"
DESCRIPTION = "This package includes the documentation for texlive-pst-slpe"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.31svn24391"

RPM_NAME = "texlive-pst-slpe-doc-2023.209.1.31svn24391-54.2.noarch.rpm"
RPM_HASH = "2187ac410a0d6a45ad137859e6c2686b951b945832875f00069bdeb29990673f6049a1b732d34d0d0164a36ffc941580ff866eebfb28dcf01d2e223a97dd60cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-slpe-doc"

RDEPENDS:${PN} += ""

inherit rpm
