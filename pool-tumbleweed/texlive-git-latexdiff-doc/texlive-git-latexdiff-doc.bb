SUMMARY = "Documentation for texlive-git-latexdiff"
DESCRIPTION = "This package includes the documentation for texlive-git-latexdiff"
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.6.0svn54732"

RPM_NAME = "texlive-git-latexdiff-doc-2023.209.1.6.0svn54732-53.1.noarch.rpm"
RPM_HASH = "c6d20a2da538d0e1c7a8ba1105b965c53efb84ad9532aae3ab20978bb60951275b5001e81c236353717b2907d44656c6992622800e9b4b48ff2d988d5f52993a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-git-latexdiff.1 \
texlive-git-latexdiff-doc"

RDEPENDS:${PN} += ""

inherit rpm
