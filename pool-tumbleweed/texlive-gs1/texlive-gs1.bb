SUMMARY = "Typeset EAN barcodes using TeX rules, only"
DESCRIPTION = "The (LaTeX3) package typesets EAN-8 and EAN-13 barcodes, using \
the facilities of the rule-D package."
LICENSE = "LPPL-1.0"

PV = "2023.201.23svn59620"

RPM_NAME = "texlive-gs1-2023.201.23svn59620-53.2.noarch.rpm"
RPM_HASH = "782741901eaf52adcaa6cc33a5fde940a4f6d9fbf0da2c4920ea29c584ddc96f3e87283fe2d43b4f01bb87363c1666e1ddb234363a1682e0f8c9c746d176aa22"
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
