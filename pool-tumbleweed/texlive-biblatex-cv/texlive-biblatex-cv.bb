SUMMARY = "Create a CV from BibTeX files"
DESCRIPTION = "This package creates an academic curriculum vitae (CV) from a \
BibTeX .bib file. The package makes use of BibLaTeX/biber to \
automatically format, group, and sort the entries on a CV."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn59433"

RPM_NAME = "texlive-biblatex-cv-2023.209.0.0.01svn59433-54.1.noarch.rpm"
RPM_HASH = "35575c36a5235c319f5569218f9c665ecc88cfe2a3a2a0a650b2439515ee2fbb834a7b1541ae6ce8e775938ef570dbe0aa64bbc666a17acfafa6aac82acb192c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-american-cv.lbx \
tex-biblatex-cv.bbx \
tex-biblatex-cv.cbx \
tex-biblatex-cv.sty \
texlive-biblatex-cv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-american.lbx \
tex-authoryear.bbx \
tex-authoryear.cbx \
tex-biblatex.sty \
tex-datenumber.sty \
tex-expl3.sty \
tex-fp.sty \
tex-totcount.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
