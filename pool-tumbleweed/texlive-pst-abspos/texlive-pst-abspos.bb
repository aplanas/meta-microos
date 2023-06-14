SUMMARY = "Put objects at an absolute position"
DESCRIPTION = "The (PSTricks-related) package provides a command \
\\pstPutAbs(x,y) to put an object at an arbitrary absolute (or \
even a relative) position on the page."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-pst-abspos-2023.201.0.0.2svn15878-52.1.noarch.rpm"
RPM_HASH = "fa127f0c5e2db36459305d66dde0d96915f1b91bc82616a089b01390cea761e13d3d16295c0ee03fc541718b0d71830387cc26768c7fff7212682bbf621315bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-abspos.sty \
tex-pst-abspos.tex \
texlive-pst-abspos"

RDEPENDS:${PN} += "/bin/sh \
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
