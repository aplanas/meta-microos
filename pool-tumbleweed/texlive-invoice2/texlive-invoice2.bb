SUMMARY = "Intelligent invoices with LaTeX3"
DESCRIPTION = "Typeset invoices with automatic VAT and calculation of totals. \
Supports internationalization, invoices are typeset with \
booktabs for readability. Does not support separate projects \
per invoice. Can be used as a replacement for invoice in most \
cases."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn46364"

RPM_NAME = "texlive-invoice2-2023.201.svn46364-52.1.noarch.rpm"
RPM_HASH = "1e05d8f538cb98cd881821563b606e748f822af9ffd32198767ca88e288193fd94cea08452b53b219e9349291681a5afb7c29ce0d0c0fff617795ac4a82847ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(invoice2.sty) \
texlive-invoice2"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(booktabs.sty) \
tex(expl3.sty) \
tex(l3keys2e.sty) \
tex(longtable.sty) \
tex(siunitx.sty) \
tex(translations.sty) \
tex(xcolor.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
