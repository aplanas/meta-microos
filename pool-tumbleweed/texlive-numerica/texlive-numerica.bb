SUMMARY = "Numerically evaluate mathematical expressions in LaTeX form"
DESCRIPTION = "This package defines a command to wrap around a mathematical \
expression in its LaTeX form and, once values are assigned to \
variables, numerically evaluate it. The intent is to avoid the \
need to modify the LaTeX form of the expression being \
evaluated. For programs with a preview facility like LyX, or \
compile-as-you-go systems, interactive back-of-envelope \
calculations and numerical exploration are possible within the \
document being worked on. The package requires the bundles \
l3kernel and l3packages, and the amsmath and mathtools \
packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.0svn61283"

RPM_NAME = "texlive-numerica-2023.201.2.0.0svn61283-54.1.noarch.rpm"
RPM_HASH = "0b27364063e870f6d672b63884186fdf3eb494fa2491a626ea75352611db6dbc37a353de30a66bb598205d055588a16a43bf15789d3aed03ea663277047d7888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numerica.sty \
texlive-numerica"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-etoolbox.sty \
tex-l3keys2e.sty \
tex-mathtools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
