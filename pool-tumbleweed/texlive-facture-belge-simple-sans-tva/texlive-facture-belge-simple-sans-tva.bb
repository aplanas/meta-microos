SUMMARY = "Simple Belgian invoice without VAT"
DESCRIPTION = "This package can be used to generate invoices for Belgian \
individuals who do not have a VAT number and who wish to do \
occasional work, or to carry out paid additional activities \
during their free time up to 6,000 euros per calendar year \
(amount indexed annually) without having to pay tax or social \
security contributions (see the website Activites \
complementaires). The package can also generate expense \
reports. All totals are calculated automatically, in the \
invoice and in the expense report. The package depends on \
calctab, ifthen, hyperref, fancyhdr, multirow, eurosym, color, \
and colortbl."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn49004"

RPM_NAME = "texlive-facture-belge-simple-sans-tva-2023.209.2.1svn49004-53.1.noarch.rpm"
RPM_HASH = "366bce47d3aaea97e806e0bf3b9331ef0acc3a29cd3dbf25a4fcf408e7a828ebbbac22b07421d9b09bdc4dd41ad1392667464b5fede4977ef7567002e7bdf2ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-facture-belge-simple-sans-tva.sty \
texlive-facture-belge-simple-sans-tva"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
