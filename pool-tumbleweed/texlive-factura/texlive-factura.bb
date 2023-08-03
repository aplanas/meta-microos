SUMMARY = "Typeset and calculate invoices according to Venezuelan law"
DESCRIPTION = "'factura' is the Spanish word for 'invoice', so this is a LaTeX \
class for typesetting and calculating invoices, taking into \
account requirements of SENIAT legislation (tax collector \
entity on the Bolivarian Republic of Venezuela). However, its \
use is not restricted to Venezuela because all variables and \
the displayed text can be redefined by invoking commands or \
editing."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.32svn61697"

RPM_NAME = "texlive-factura-2023.209.4.32svn61697-53.1.noarch.rpm"
RPM_HASH = "1a754b42071fc38632fb145a2d242b49ef29bd3b25c95b0320a4dec2f2ad4d66095b20089202f24a5a9818fd96f823450354c1010afb8659235c443ba05e0362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-factura.cls \
tex-factura.def \
texlive-factura"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-article.cls \
tex-atbegshi.sty \
tex-babel.sty \
tex-calc.sty \
tex-datetime2.sty \
tex-environ.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-fp-upn.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-numprint.sty \
tex-tabularx.sty \
tex-textpos.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xstring.sty \
tex-zref-savepos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
