SUMMARY = "Radboud University Titlepage Package"
DESCRIPTION = "This is an unofficial LaTeX package to generate titlepages for \
the Radboud University, Nijmegen. It uses official vector logos \
from the university. This package requires the following other \
LaTeX packages: geometry, graphicx, ifpdf, keyval, iflang, and, \
optionnaly, babel-dutch."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn62143"

RPM_NAME = "texlive-rutitlepage-2023.201.3.0svn62143-53.1.noarch.rpm"
RPM_HASH = "141de322e7a5162ed8d9bc7e5bce7d45c0776e45cb4163b59bf1c9d77ba5a7ac41290bab7b81968d30244d923632c835548ec9ece7afc6a9a1add9a9e3d2958b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(rutitlepage.sty) \
texlive-rutitlepage"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(iflang.sty) \
tex(ifpdf.sty) \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
