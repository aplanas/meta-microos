SUMMARY = "A PSTricks-compatible graphicx for use with Plain TeX"
DESCRIPTION = "The package provides a version of graphicx that avoids loading \
the graphics bundle's (original) keyval package, which clashes \
with pstricks' use of xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn21717"

RPM_NAME = "texlive-pst-graphicx-2023.201.0.0.02svn21717-52.1.noarch.rpm"
RPM_HASH = "b289ed6a9ee964813af0b4760865fd56a25d619adedd20152d6cb00df96f1fd3942cbb833ef33a2755b9a4b3aa5b2eb50203a8c091a0b794b5f56861b1e9cdbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-graphicx.tex \
texlive-pst-graphicx"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
