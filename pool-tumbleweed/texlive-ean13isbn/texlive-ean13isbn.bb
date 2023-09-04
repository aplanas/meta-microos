SUMMARY = "Print EAN13 for ISBN"
DESCRIPTION = "The package provides the means to typeset ISBN codes with \
EAN-13; it uses the (generic) package ean13.tex to typeset the \
actual barcode."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn57514"

RPM_NAME = "texlive-ean13isbn-2023.209.svn57514-54.2.noarch.rpm"
RPM_HASH = "bf7a12cbbe3ba28ac003ff44ce519a621f62b041977026350e071c517eac5be277144d5975b3806c181b163e86d352d1da280a10f5760e0cf1753188a07592ae"
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
