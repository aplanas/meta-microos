SUMMARY = "Intelligent invoices with LaTeX3"
DESCRIPTION = "Typeset invoices with automatic VAT and calculation of totals. \
Supports internationalization, invoices are typeset with \
booktabs for readability. Does not support separate projects \
per invoice. Can be used as a replacement for invoice in most \
cases."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn46364"

RPM_NAME = "texlive-invoice2-2023.209.svn46364-54.1.noarch.rpm"
RPM_HASH = "817490550dbd5c69b7eca2138bdfe9b49524c50308b69e67b666024311f6008f33ce433ca2f6842b11b20c5bc6c77a39f3c994191c0d19b5c84815f0a475e8bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-invoice2.sty \
texlive-invoice2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-longtable.sty \
tex-siunitx.sty \
tex-translations.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-siunitx"

inherit rpm
