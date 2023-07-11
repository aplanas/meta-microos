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

RPM_NAME = "texlive-resolsysteme-2023.201.0.0.1.5svn66192-53.2.noarch.rpm"
RPM_HASH = "15c049b4ac8677ab1f7d8e934e2652dbb178e40f1c4000d3628f2c02cc65bf398f414c01811db7c290acecd931cf855249fed7204e8f6b69b3c915c2eeaeef7b"
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
