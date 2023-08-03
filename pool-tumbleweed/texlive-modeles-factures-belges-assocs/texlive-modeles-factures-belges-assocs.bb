SUMMARY = "Generate invoices for Belgian non-profit organizations"
DESCRIPTION = "This package provides templates and a sty file for generating \
invoices for Belgian non-profit organizations."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn50010"

RPM_NAME = "texlive-modeles-factures-belges-assocs-2023.209.1.0.1svn50010-55.1.noarch.rpm"
RPM_HASH = "54bd9abb63edd2c69137f4e70cdd1b41eb2cff9e856a91ea899dd19790a56a18afba497b6ba706e28a488dde190d88877234fe524cecefdceef5a27682bf5340"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-modeles-factures-belges-associations.sty \
texlive-modeles-factures-belges-assocs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-array.sty \
tex-babel.sty \
tex-calctab.sty \
tex-color.sty \
tex-colortbl.sty \
tex-eurosym.sty \
tex-fancyhdr.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-lmodern.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-multirow.sty \
tex-soul.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
