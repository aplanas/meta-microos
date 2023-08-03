SUMMARY = "Make Classic Cyrillic CM fonts accessible in LaTeX"
DESCRIPTION = "The package makes the classic CM Cyrillic fonts accessible for \
use with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-lcyw-2023.209.1.1svn15878-55.1.noarch.rpm"
RPM_HASH = "c97dd83775a4759b88466586629a425665f0a30d7a0e5bea33e0701ec5c0f334435821cc1fe829e98ab732de671cf11505558dae6e796a95a6f04a23cf65c3fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmap-cyr-vf.sty \
tex-lcywcmr.fd \
tex-lcywcmss.fd \
tex-lcywcmssq.fd \
tex-lcywcmtt.fd \
tex-lcywenc.def \
texlive-lcyw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifpdf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
