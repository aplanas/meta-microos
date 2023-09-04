SUMMARY = "Typeset EAN barcodes using TeX rules, only"
DESCRIPTION = "The (LaTeX3) package typesets EAN-8 and EAN-13 barcodes, using \
the facilities of the rule-D package."
LICENSE = "LPPL-1.0"

PV = "2023.209.23svn59620"

RPM_NAME = "texlive-gs1-2023.209.23svn59620-54.2.noarch.rpm"
RPM_HASH = "624dbb8831b5d039277bc1b9cfc6ba3805e2fc3bc97e29111165c4938ae1f33201499832a7f453891a25fdca68efea1d3d006252e2b11759b696fad758143fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-GS1.sty \
tex-rule-D.sty \
texlive-gs1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
