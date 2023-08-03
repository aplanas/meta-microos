SUMMARY = "Symbols for transformations"
DESCRIPTION = "The bundle provides Metafont source for a small font used for \
(e.g.) Laplace transformations, together with a LaTeX .fd file \
and a package providing commands for the symbols' use in \
mathematics."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn18732"

RPM_NAME = "texlive-trsym-2023.209.1.0svn18732-53.1.noarch.rpm"
RPM_HASH = "f6f8929a455ac522e9b07990c51e790cfb0a6e7ae72f4e32bd5bb4e11487c711f4037e2a9b1756b2559877f1ea1073adac952dc9a2f24f50abc070c1d5c4a5ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-trsy10.tfm \
tex-trsy12.tfm \
tex-trsym.sty \
tex-utrsy.fd \
texlive-trsym"

RDEPENDS:${PN} += "/usr/bin/sh \
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
