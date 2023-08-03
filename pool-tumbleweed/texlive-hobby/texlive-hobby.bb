SUMMARY = "An implementation of Hobby's algorithm for PGF/TikZ"
DESCRIPTION = "This package defines a path generation function for PGF/TikZ \
which implements Hobby's algorithm for a path built out of \
Bezier curves which passes through a given set of points. The \
path thus generated may by used as a TikZ 'to path'. The \
implementation is in LaTeX3."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn44474"

RPM_NAME = "texlive-hobby-2023.209.1.8svn44474-54.1.noarch.rpm"
RPM_HASH = "cd476a3e80ab9b6f9a1a3645094f2d68eeb802cc9298eb4a9665bdda9931a010c67b85e9302fef75e4425cbbb0468a8cceb05715699652521c1ad2f557bc51eb"
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
