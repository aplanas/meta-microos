SUMMARY = "Generate invoices"
DESCRIPTION = "The package may be used for generating invoices. The package \
can deal with invisible expense items and deductions; output \
may be presented in any of 10 different languages. A \
long-standing bug has been removed. Numbers now can show the \
comma as decimal separator. The package depends on the fp, calc \
and siunitx for its calculations."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn48359"

RPM_NAME = "texlive-invoice-2023.208.svn48359-53.1.noarch.rpm"
RPM_HASH = "71c7d467899f9c5e0f605d2c4e334f12d40d10205f51902f44ae5733db9859a08c03a88054434458892a33baa7082f85ae49a00657da0cd1728d807682b8d379"
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
