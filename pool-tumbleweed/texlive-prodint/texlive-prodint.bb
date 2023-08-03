SUMMARY = "A font that provides the product integral symbol"
DESCRIPTION = "Product integrals are to products, as integrals are to sums. \
They have been around for more than a hundred years, they have \
not become part of the standard mathematician's toolbox, \
possibly because no-one invented the right mathematical symbol \
for them. The authors have remedied that situation by proposing \
the symbol and providing this font."
LICENSE = "OFL-1.1"

PV = "2023.209.svn21893"

RPM_NAME = "texlive-prodint-2023.209.svn21893-53.1.noarch.rpm"
RPM_HASH = "bcbb76e99b387048ea101888a4aea2394e32f91574e1c24df873de0cd9b70fa364d4afc2c11ddd69a3d6d498b1436935c962c0b0558b993f7586bd0bd1d81bfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prodint.map \
tex-prodint.sty \
tex-prodint.tfm \
texlive-prodint"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-prodint-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
