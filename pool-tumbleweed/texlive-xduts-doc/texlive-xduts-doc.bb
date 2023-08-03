SUMMARY = "Documentation for texlive-xduts"
DESCRIPTION = "This package includes the documentation for texlive-xduts"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.1.2.0svn66472"

RPM_NAME = "texlive-xduts-doc-2023.209.6.1.2.0svn66472-53.1.noarch.rpm"
RPM_HASH = "725cfe2ce1bf4340c5cc534231ec5ea0201f69713af48556e3834f386d7adcce4483ce7d35c76a5ed813e2168023503f6aeb4822cd542874d65c224fe92d949f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xduts-doc-zh \
texlive-xduts-doc"

RDEPENDS:${PN} += ""

inherit rpm
