SUMMARY = "An implementation of Hobby's algorithm for PGF/TikZ"
DESCRIPTION = "This package defines a path generation function for PGF/TikZ \
which implements Hobby's algorithm for a path built out of \
Bezier curves which passes through a given set of points. The \
path thus generated may by used as a TikZ 'to path'. The \
implementation is in LaTeX3."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn44474"

RPM_NAME = "texlive-hobby-2023.201.1.8svn44474-53.2.noarch.rpm"
RPM_HASH = "0f5b1c94c206bba6ce3caede01a2f66cb27bd551a70677b14c0f3efc6d387f0cab76658d4e397c39de2546f7cde67c3b29e00f6150e3aa15ed9f5ce4e5c4ab32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hobby.code.tex \
tex-pgflibraryhobby.code.tex \
tex-pml3array.sty \
tex-tikzlibraryhobby.code.tex \
texlive-hobby"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
