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

PV = "2023.209.2.0.0svn61283"

RPM_NAME = "texlive-numerica-2023.209.2.0.0svn61283-55.1.noarch.rpm"
RPM_HASH = "2e1ce7db5ce8ee154c4956b0197967597614b4fdd1b9c929431f94414442c6cacccdce1e194a39f681606525a34d7aeb436f33009d2d0f5273853b4edfd0edea"
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
