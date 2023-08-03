SUMMARY = "A Greek font, from one such by Baskerville"
DESCRIPTION = "The font is a digital implementation of Baskerville's classic \
Greek font, provided by the Greek Font Society. The font covers \
Greek only, and LaTeX support provides for the use of LGR \
encoding."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn19440"

RPM_NAME = "texlive-gfsbaskerville-2023.209.1.0svn19440-53.1.noarch.rpm"
RPM_HASH = "35fbb3255f99c003b67a0dd6534ce2870298f281353abb1ed8e1535927de27d0176c13e87cbada2230e2881db2e5f871ce86a9651246c2576979df40681e6866"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gfsbaskerville.map \
tex-gfsbaskerville.sty \
tex-ggfsbaskervillerg6a.tfm \
tex-ggfsbaskervillerg6a.vf \
tex-ggfsbaskervillerg6r.tfm \
tex-gpgfsbaskerville.enc \
tex-lgrgfsbaskerville.fd \
texlive-gfsbaskerville"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-gfsbaskerville-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
