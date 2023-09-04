SUMMARY = "Generate invoices"
DESCRIPTION = "The package may be used for generating invoices. The package \
can deal with invisible expense items and deductions; output \
may be presented in any of 10 different languages. A \
long-standing bug has been removed. Numbers now can show the \
comma as decimal separator. The package depends on the fp, calc \
and siunitx for its calculations."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn48359"

RPM_NAME = "texlive-invoice-2023.209.svn48359-54.1.noarch.rpm"
RPM_HASH = "f8e71ab2c84c5f756ca88627d0dde3d0c666b6a672b6ee7343f6763011845cb51986e1c140aa4c3f2a5d1703337e2775266e034e77366cc77ecfbe6533b5e420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-invoice.sty \
tex-invoicelabels.sty \
texlive-invoice"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fp.sty \
tex-ifthen.sty \
tex-longtable.sty \
tex-siunitx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
