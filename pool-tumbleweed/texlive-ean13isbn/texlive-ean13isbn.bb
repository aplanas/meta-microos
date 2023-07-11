SUMMARY = "Print EAN13 for ISBN"
DESCRIPTION = "The package provides the means to typeset ISBN codes with \
EAN-13; it uses the (generic) package ean13.tex to typeset the \
actual barcode."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn57514"

RPM_NAME = "texlive-ean13isbn-2023.201.svn57514-53.2.noarch.rpm"
RPM_HASH = "03a54dafe5e5c55c51bb1f7dc23be60279e4316e38078e74fd840c091710fe1bf77fbd6b648adf2498eac90d60e2de0f3ea4762a6ad986fe63070adfba02cf40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ean13isbn.sty \
texlive-ean13isbn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
