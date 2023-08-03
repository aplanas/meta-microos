SUMMARY = "Atomic and molecular orbitals using TikZ"
DESCRIPTION = "Atomic s, p and d orbitals may be drawn, as well as molecular \
orbital diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn36439"

RPM_NAME = "texlive-tikzorbital-2023.209.svn36439-53.1.noarch.rpm"
RPM_HASH = "e1f6af065fe628e0e0d71cb49f1bf31c5897740920bf0c053b3ddf63e472dfb59d1cb25f661ee25af44e4531a3510c7a5d49d754348901665a0f37af3536718c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzorbital.sty \
texlive-tikzorbital"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
