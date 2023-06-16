SUMMARY = "Easy typesetting of invoices"
DESCRIPTION = "This package lets you easily typeset professional-looking \
invoices. The user specifies the content of the invoice by \
different \\setPROPERTY commands, and an invoice is generated \
automatically with the \\makeinvoice command."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn45673"

RPM_NAME = "texlive-simpleinvoice-2023.201.svn45673-53.1.noarch.rpm"
RPM_HASH = "30cbc5432f64fe9e8209c05002a118e25cc53bf81b30f0b08900293a3251622fa6e9711075803e3844b327276487534d5e3efdbe0b531b98fea8dc50eeec98b8"
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
