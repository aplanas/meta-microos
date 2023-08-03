SUMMARY = "Print EAN13 for ISBN"
DESCRIPTION = "The package provides the means to typeset ISBN codes with \
EAN-13; it uses the (generic) package ean13.tex to typeset the \
actual barcode."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn57514"

RPM_NAME = "texlive-ean13isbn-2023.209.svn57514-54.1.noarch.rpm"
RPM_HASH = "fa2cdb41492020dcdfe4a38ad75d8921cb8791a57394db86564e7c62afe30f5727662388075cdffc4c9e8c8b0b5f1b128528c0c67997b7a87c6a48edec32db13"
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
