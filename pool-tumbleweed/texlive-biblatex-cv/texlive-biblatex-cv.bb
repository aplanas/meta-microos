SUMMARY = "Create a CV from BibTeX files"
DESCRIPTION = "This package creates an academic curriculum vitae (CV) from a \
BibTeX .bib file. The package makes use of BibLaTeX/biber to \
automatically format, group, and sort the entries on a CV."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn59433"

RPM_NAME = "texlive-biblatex-cv-2023.201.0.0.01svn59433-53.1.noarch.rpm"
RPM_HASH = "1d5a269af8d94e2f9c9f2010c39fb416adceee22950eb8e603c42e5021565780254c7379d7d034912dd2d1f2c48367d64a9c40fea0b9699103bd4657cd3bb7dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(american-cv.lbx) \
tex(biblatex-cv.bbx) \
tex(biblatex-cv.cbx) \
tex(biblatex-cv.sty) \
texlive-biblatex-cv"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(american.lbx) \
tex(authoryear.bbx) \
tex(authoryear.cbx) \
tex(biblatex.sty) \
tex(datenumber.sty) \
tex(expl3.sty) \
tex(fp.sty) \
tex(totcount.sty) \
tex(xparse.sty) \
tex(xpatch.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
