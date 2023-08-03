SUMMARY = "SymbolsADF with TeX/LaTeX support"
DESCRIPTION = "The package provides Arkandis foundry's ArrowsADF and \
BulletsADF fonts in Adobe Type 1 format, together with \
TeX/LaTeX support files."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2bsvn54512"

RPM_NAME = "texlive-adfsymbols-2023.209.1.2bsvn54512-55.1.noarch.rpm"
RPM_HASH = "b2860715923ae7a7ddf485a41192725146658d620ee20bfbd0984b2e61f2fa114d504bc4d57d8d22ce52a7baf65eec90d4cd68a335927b69457d5116b97a8803"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ArrowsADF.map \
tex-ArrowsADF.tfm \
tex-BulletsADF.map \
tex-BulletsADF.tfm \
tex-SymbolsADF.enc \
tex-adfarrows.sty \
tex-adfbullets.sty \
tex-uarrowsadf.fd \
tex-ubulletsadf.fd \
texlive-adfsymbols"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-pifont.sty \
tex-updmap.cfg \
texlive \
texlive-adfsymbols-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
