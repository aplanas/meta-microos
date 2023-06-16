SUMMARY = "Work on linear systems using xint or pyluatex"
DESCRIPTION = "This package provides some commands (in French) to perform \
calculations on small (2x2 or 3x3 or 4x4) linear systems, with \
xint or pyluatex: \\DetMatrice or \\DetMatricePY to diplay the \
determinant of a matrix (with formatting options); \
\\MatriceInverse or \\MatriceInversePY to display the invers of a \
matrix (with formatting options) ; \\SolutionSysteme or \
\\SolutionSystemePY to display the solution of a linear system \
(with formatting options); ..."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.5svn66192"

RPM_NAME = "texlive-resolsysteme-2023.201.0.0.1.5svn66192-53.1.noarch.rpm"
RPM_HASH = "bfb5655eb938ef112fca13222d49047623991691f4732585221eccd8b733cd2328de0a7f370debc8855ce0b0f96742d2f3839b00f2bd8e9f380565db48616325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ResolSysteme.sty \
texlive-resolsysteme"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-listofitems.sty \
tex-nicefrac.sty \
tex-nicematrix.sty \
tex-siunitx.sty \
tex-xintexpr.sty \
tex-xinttools.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
