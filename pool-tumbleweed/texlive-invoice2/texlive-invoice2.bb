SUMMARY = "Intelligent invoices with LaTeX3"
DESCRIPTION = "Typeset invoices with automatic VAT and calculation of totals. \
Supports internationalization, invoices are typeset with \
booktabs for readability. Does not support separate projects \
per invoice. Can be used as a replacement for invoice in most \
cases."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.svn46364"

RPM_NAME = "texlive-invoice2-2023.208.svn46364-53.1.noarch.rpm"
RPM_HASH = "4ca17ef49b0f1ae450f9f69bc0fd0724a53e55d855b26ba88c5b0f089d11ac27a0e9df5d97c9626fb47ea2d8816f70597d8c09934669525fd879c0940029f20f"
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
