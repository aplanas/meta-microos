SUMMARY = "Scheme for naming fonts in TeX"
DESCRIPTION = "The scheme for assigning names is described (in the \
documentation part of the package), and map files giving the \
relation between foundry name and 'TeX-name' are also provided."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn64477"

RPM_NAME = "texlive-fontname-2023.209.svn64477-53.1.noarch.rpm"
RPM_HASH = "bcb0e4675e4800079e62f0f0da058be28d20bcc7aa422f1a497691238d49c44ab91855dfe6599b7ae78833154b25e07c43340692c51755fe21ee088e2efccf24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-adobe.map \
tex-apple.map \
tex-bitstrea.map \
tex-dtc.map \
tex-itc.map \
tex-linot-cd.map \
tex-linotype-cd.map \
tex-linotype.map \
tex-monotype.map \
tex-skey1250.map \
tex-skey1555.map \
tex-softkey-1250.map \
tex-softkey-1555.map \
tex-softkey.map \
tex-special.map \
tex-supplier.map \
tex-texfonts.map \
tex-typeface.map \
tex-urw.map \
tex-variant.map \
tex-weight.map \
tex-width.map \
tex-yandy.map \
texlive-fontname"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
