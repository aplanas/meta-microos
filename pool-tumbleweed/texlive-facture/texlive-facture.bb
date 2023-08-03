SUMMARY = "Generate an invoice"
DESCRIPTION = "Une classe simple permettant de produire une facture, avec ou \
sans TVA, avec gestion d'une adresse differente pour la \
livraison et pour la facturation. A simple class that allows \
production of an invoice, with or without VAT; different \
addresses for delivery and for billing are permitted."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.2svn43865"

RPM_NAME = "texlive-facture-2023.209.1.2.2svn43865-53.1.noarch.rpm"
RPM_HASH = "3f3fafeec4c0e0e6c8ed07988c07ac26eb626aab0978bc49d0d7a20abfd5780daa60933c4f0fc70ddc0c919f486879410012e8e74b245f7d5ed1ad68dcba1d8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-facture.cls \
texlive-facture"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-advdate.sty \
tex-array.sty \
tex-article.cls \
tex-colortbl.sty \
tex-fancyhdr.sty \
tex-fltpoint.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-longtable.sty \
tex-numprint.sty \
tex-polyglossia.sty \
tex-tikz.sty \
tex-xargs.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
