SUMMARY = "Typeset EAN barcodes using TeX rules, only"
DESCRIPTION = "The (LaTeX3) package typesets EAN-8 and EAN-13 barcodes, using \
the facilities of the rule-D package."
LICENSE = "LPPL-1.0"

PV = "2023.209.23svn59620"

RPM_NAME = "texlive-gs1-2023.209.23svn59620-54.1.noarch.rpm"
RPM_HASH = "718ae19c3e99695bd7299794d821238dc8ccca05978b9afdc72c7ef0d0b1f451e8f77beaff08fa7a5268705fea7d2d5e7e7eacd68717a225d892cc769d2f046a"
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
