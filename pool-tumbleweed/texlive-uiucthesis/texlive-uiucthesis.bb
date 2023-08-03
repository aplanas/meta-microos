SUMMARY = "UIUC thesis class"
DESCRIPTION = "The class produces a document that conforms to the format \
described in the University's Handbook for Graduate Students \
Preparing to Deposit."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.25svn15878"

RPM_NAME = "texlive-uiucthesis-2023.209.2.25svn15878-54.1.noarch.rpm"
RPM_HASH = "5211b78cbb5b78aa382a618d106b7bcefe67f0ce40af9eb33148cd9b462cbfe776bd88d10174005a442b16104d59fe640fab53374d681609417d100b3694089c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uiucthesis.cls \
tex-uiucthesis.sty \
texlive-uiucthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
