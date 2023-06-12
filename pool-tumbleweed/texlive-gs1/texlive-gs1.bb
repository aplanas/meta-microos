SUMMARY = "Typeset EAN barcodes using TeX rules, only"
DESCRIPTION = "The (LaTeX3) package typesets EAN-8 and EAN-13 barcodes, using \
the facilities of the rule-D package."
LICENSE = "LPPL-1.0"

PV = "2023.201.23svn59620"

RPM_NAME = "texlive-gs1-2023.201.23svn59620-53.1.noarch.rpm"
RPM_HASH = "7884ded2e458c8e0804e82cc1bfa99f9672c6e6ac24bfa362417791604cc8a3de815099e516b514a5a62a1a41da73630098057b6ec0e95b7ac1204814850b65e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(GS1.sty) \
tex(rule-D.sty) \
texlive-gs1"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
