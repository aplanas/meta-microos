SUMMARY = "A set of tools for generating conference proceedings"
DESCRIPTION = "The confproc collection comprises a class, a BibTeX style, and \
some scripts for generating conference proceedings. It derives \
from LaTeX scripts written for the DAFx-06 conference \
proceedings, largely based on the pdfpages package for \
including the proceedings papers and the hyperref package for \
creating a proper table of contents, bookmarks and general \
bibliography back-references. Confproc also uses many other \
packages for fine tuning of the table of contents, bibliography \
and index of authors. The added value of the class resides in \
its time-saving aspects when designing conference proceedings."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8svn29349"

RPM_NAME = "texlive-confproc-2023.209.0.0.8svn29349-55.1.noarch.rpm"
RPM_HASH = "2f821b2e69a4c46cbb896f76bb7a83e4b863b24986162b4c975ece727e7ac323f66a81d0e5117715a8be2faa4ccff19acbbd960b905c66b346bd7a60a91adeb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-confproc.cfg \
tex-confproc.cls \
tex-newapave.sty \
texlive-confproc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-bookmark.sty \
tex-color.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-index.sty \
tex-kvoptions-patch.sty \
tex-kvoptions.sty \
tex-multicol.sty \
tex-multitoc.sty \
tex-pdfpages.sty \
tex-sectsty.sty \
tex-titletoc.sty \
tex-tocbibind.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
