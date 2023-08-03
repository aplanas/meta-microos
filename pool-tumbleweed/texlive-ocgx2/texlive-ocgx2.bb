SUMMARY = "Drop-in replacement for 'ocgx' and 'ocg-p'"
DESCRIPTION = "This package serves as a drop-in replacement for the packages \
ocgx by Paul Gaborit and ocg-p by Werner Moshammer for the \
creation of PDF Layers. It re-implements the functionality of \
the ocg, ocgx, and ocg-p packages and adds support for all \
known engines and back-ends including: LaTeX - dvips - \
ps2pdf/Distiller (Xe)LaTeX(x) - dvipdfmx pdfLaTeX and LuaLaTeX \
. It also ensures compatibility with the media9 and animate \
packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.56svn65292"

RPM_NAME = "texlive-ocgx2-2023.209.0.0.56svn65292-55.1.noarch.rpm"
RPM_HASH = "49db837021d6e736d6250166c74d8d886c14a620a7d00147ff2aecd5352eeac4e957a5de13fbe02c312271f3be93f3574aaee022e728700410936b95bb2a8f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixocgx.sty \
tex-ocgbase.sty \
tex-ocgx2.sty \
texlive-ocgx2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-ocgx.sty \
tex-pdfbase.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
