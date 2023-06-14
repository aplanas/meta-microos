SUMMARY = "A stretchable \\thinspace for LaTeX"
DESCRIPTION = "The package redefines \\thinspace to have a stretch component."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2svn39669"

RPM_NAME = "texlive-thinsp-2023.201.0.0.2svn39669-54.1.noarch.rpm"
RPM_HASH = "96b493cd940ff64b2cd09e974332aa068b291f9e250d270c35841ac8d70aaf88f4951616f380f82f76327d55a7648927c396b2d8705c06bef252d95833893a48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thinsp.sty \
texlive-thinsp"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
