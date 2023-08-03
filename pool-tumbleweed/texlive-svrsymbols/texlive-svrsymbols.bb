SUMMARY = "A font with symbols for use in physics texts"
DESCRIPTION = "The svrsymbols package is a LaTeX interface to the SVRsymbols \
font. The glyphs of this font are ideograms that have been \
designed for use in physics texts. Some symbols are standard \
and some are entirely new."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn50019"

RPM_NAME = "texlive-svrsymbols-2023.209.2.0bsvn50019-58.1.noarch.rpm"
RPM_HASH = "38cf68767a10865ae6387c4401914ed2bfa3a30d637a954d11ac70a3978ab826806b632aeee40600d6b7d72ba73d3cfb1179e1fdcd9c99d5dc98b5cf735d60fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-SVRsymbols.tfm \
tex-svrsymbols.map \
tex-svrsymbols.sty \
texlive-svrsymbols"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-svrsymbols-fonts"

inherit rpm
