SUMMARY = "Documentation for texlive-circledtext"
DESCRIPTION = "This package includes the documentation for texlive-circledtext"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn63166"

RPM_NAME = "texlive-circledtext-doc-2023.209.1.1.0svn63166-54.1.noarch.rpm"
RPM_HASH = "f4e2d94449b5335607c5e40a08e02252c301b396f103b059894e7d3d33fae975570413dc4f181895e964a45d378f588b7514b46e31356260f315fce295ab38c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) \
locale(texlive-circledtext-doc-zh \
texlive-circledtext-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
