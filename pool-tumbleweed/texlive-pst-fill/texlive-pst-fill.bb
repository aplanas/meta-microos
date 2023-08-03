SUMMARY = "Fill or tile areas with PSTricks"
DESCRIPTION = "Pst-fill is a PSTricks-based package for filling and tiling \
areas or characters."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn60671"

RPM_NAME = "texlive-pst-fill-2023.209.1.02svn60671-53.1.noarch.rpm"
RPM_HASH = "2a9c57c056234b87987f0d4b1a5134b5481178ea94785b9acc055a188a39dcf9c079d45b9ca55f0dca611bc102b3e5bda5ea71c158cbf51876f1ebcd1df52bf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-fill.sty \
tex-pst-fill.tex \
texlive-pst-fill"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
