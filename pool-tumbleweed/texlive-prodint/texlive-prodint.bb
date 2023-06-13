SUMMARY = "A font that provides the product integral symbol"
DESCRIPTION = "Product integrals are to products, as integrals are to sums. \
They have been around for more than a hundred years, they have \
not become part of the standard mathematician's toolbox, \
possibly because no-one invented the right mathematical symbol \
for them. The authors have remedied that situation by proposing \
the symbol and providing this font."
LICENSE = "OFL-1.1"

PV = "2023.201.svn21893"

RPM_NAME = "texlive-prodint-2023.201.svn21893-52.1.noarch.rpm"
RPM_HASH = "fda630fcd426d93f9d179080c29c093f1db66fed3e936669995bb347ac361567afe47f2ff525a57abef75d988c4c6c2bc7b08f840dbb96d6e58aacce06ebb928"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(prodint.map) \
tex(prodint.sty) \
tex(prodint.tfm) \
texlive-prodint"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-prodint-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
