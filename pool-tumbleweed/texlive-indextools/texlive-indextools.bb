SUMMARY = "Producing multiple indices"
DESCRIPTION = "This package enables the user to produce and typeset one or \
more indices simultaneously. The package is known to work in \
LaTeX documents processed with pdfLaTeX, XeLaTeX and LuaLaTeX. \
If makeindex is used for processing the index entries, no \
particular setup is needed when TeX Live is used. Using xindy \
or other programs, it is necessary to enable shell escape. \
Shell escape is also needed if splitindex is used. This is a \
fork of imakeidx, with new features and fixed bugs."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.5.1svn38931"

RPM_NAME = "texlive-indextools-2023.208.1.5.1svn38931-53.1.noarch.rpm"
RPM_HASH = "34b2fcc00ecfc3cde4405cb5d1db05e68b461d752562e40200c5969329d7ae121af9730d37444f630d0728016743933ea25973ee77123cfa46675032cb71574c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-indextools.sty \
texlive-indextools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-letltxmacro.sty \
tex-multicol.sty \
tex-pdftexcmds.sty \
tex-xkeyval.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
