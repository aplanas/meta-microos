SUMMARY = "A font for Frege's Grundgesetze der Arithmetik"
DESCRIPTION = "The fonts are provided as Metafont source and Adobe Type 1 \
(pfb) files. A small LaTeX package (fge) is included."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.25svn37628"

RPM_NAME = "texlive-fge-2023.209.1.25svn37628-53.1.noarch.rpm"
RPM_HASH = "5eab841693d0a5888f46a1a4ffde052df7cf01cba7edf5a72f7ffa48f3c5453cb4a6083bbbd2e50a0b94ff0f129c5e52c70c865823e28d573481efb8402f4276"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Ufgeit.fd \
tex-Ufgerm.fd \
tex-fge.cfg \
tex-fge.map \
tex-fge.sty \
tex-fgeit10.tfm \
tex-fgerm10.tfm \
texlive-fge"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-fge-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
