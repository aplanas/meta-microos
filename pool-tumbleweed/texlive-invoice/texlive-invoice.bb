SUMMARY = "Generate invoices"
DESCRIPTION = "The package may be used for generating invoices. The package \
can deal with invisible expense items and deductions; output \
may be presented in any of 10 different languages. A \
long-standing bug has been removed. Numbers now can show the \
comma as decimal separator. The package depends on the fp, calc \
and siunitx for its calculations."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn48359"

RPM_NAME = "texlive-invoice-2023.201.svn48359-52.1.noarch.rpm"
RPM_HASH = "8c409603bfbf5f2c7c7ac3a75ef2910dad852dfea62616d44c5c79a6f39c4acaebb5f3b055fecc503def3bcbfd9b7b5410803adfefd21628235a4a02d442697f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(invoice.sty) \
tex(invoicelabels.sty) \
texlive-invoice"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(fp.sty) \
tex(ifthen.sty) \
tex(longtable.sty) \
tex(siunitx.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
