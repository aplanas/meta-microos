SUMMARY = "Easy typesetting of invoices"
DESCRIPTION = "This package lets you easily typeset professional-looking \
invoices. The user specifies the content of the invoice by \
different \\setPROPERTY commands, and an invoice is generated \
automatically with the \\makeinvoice command."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn45673"

RPM_NAME = "texlive-simpleinvoice-2023.209.svn45673-54.1.noarch.rpm"
RPM_HASH = "1a9d04ce9654d4ca0273a85a983102cfbae9efc0e5f19c2df68272b4dec2c95678271c56a780ce1d482c433d99c8ce57840ce162f3ba34d1f82669d0ba8995fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simpleinvoice.sty \
texlive-simpleinvoice"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-advdate.sty \
tex-babel.sty \
tex-colortbl.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-tabularx.sty \
tex-url.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
