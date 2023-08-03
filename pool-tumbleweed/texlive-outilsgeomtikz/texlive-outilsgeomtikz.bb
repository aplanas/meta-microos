SUMMARY = "Some geometric tools, with TikZ"
DESCRIPTION = "This package provides some commands, with French keys, to \
display geometric tools using TikZ, for example a pen, a \
compass, a rule, a square, a protractor, ..."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn66461"

RPM_NAME = "texlive-outilsgeomtikz-2023.209.0.0.1.1svn66461-55.1.noarch.rpm"
RPM_HASH = "9ce176e21333a351e2d6d4c862c16d82e9cd99366dc095df34cf49ed0f6d9f3d41475a569705fc26c902c04405e0b11c3a957a011a9eb96131058b7722a2d1fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-OutilsGeomTikz.sty \
texlive-outilsgeomtikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-nicefrac.sty \
tex-pgffor.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
