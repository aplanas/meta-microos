SUMMARY = "Print barcodes using PostScript"
DESCRIPTION = "The pst-barcode package allows printing of barcodes, in a huge \
variety of formats, including quick-response (qr) codes (see \
documentation for details). As a PSTricks package, the package \
requires pstricks. The package uses PostScript for calculating \
the bars. For PDF output use a multi-pass mechansism such as \
pst-pdf."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.19svn64182"

RPM_NAME = "texlive-pst-barcode-2023.209.0.0.19svn64182-53.1.noarch.rpm"
RPM_HASH = "6182be3832de53867a91ad4cbadc11b5a5dce79acf8e76bde4d911460d2b2cc9b16277144498e830b58e81809d50e9ecd6c27e8ae4ccf10833b9f81b0056946c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-barcode.sty \
tex-pst-barcode.tex \
texlive-pst-barcode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
