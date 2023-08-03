SUMMARY = "Humanities styles for BibLaTeX"
DESCRIPTION = "A small collection of styles for the BibLaTeX package. It was \
designed for citations in the humanities and offers some \
features that are not provided by the standard BibLaTeX styles. \
The styles are dependent on BibLaTeX (at least version 0.9b) \
and cannot be used without it. Eine kleine Sammlung von Stilen \
fur das Paket BibLaTeX. Es ist auf geisteswissenschaftliche \
Zitierweise zugeschnitten und bietet einige Funktionen, die von \
den Standard-Stilen von BibLaTeX nicht direkt bereitgestellt \
werden. Das Paket baut vollstandig auf BibLaTeX auf und kann \
nicht ohne BibLaTeX (mindestens in der Version 0.9b) verwendet \
werden."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7bsvn66579"

RPM_NAME = "texlive-biblatex-dw-2023.209.1.7bsvn66579-54.1.noarch.rpm"
RPM_HASH = "71e77a24d5c59c6c2d8e423f17f9211f9b82f38afccca9f53cb96f75295775026f4c36d152da12f60afbfbeb6194732df3f7e321832cea3ec8414a351bec911c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-authortitle-dw.bbx \
tex-authortitle-dw.cbx \
tex-english-dw.lbx \
tex-footnote-dw.bbx \
tex-footnote-dw.cbx \
tex-german-dw.lbx \
tex-standard-dw.bbx \
tex-standard-dw.cbx \
texlive-biblatex-dw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
