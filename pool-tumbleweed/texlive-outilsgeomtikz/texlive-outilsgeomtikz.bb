SUMMARY = "Some geometric tools, with TikZ"
DESCRIPTION = "This package provides some commands, with French keys, to \
display geometric tools using TikZ, for example a pen, a \
compass, a rule, a square, a protractor, ..."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn66461"

RPM_NAME = "texlive-outilsgeomtikz-2023.201.0.0.1.1svn66461-54.1.noarch.rpm"
RPM_HASH = "2655099b751e4b394226981cd9440c9c6fa7b96d4557ed004e70f84d3205167cf3e070a171c03b77426a823c1e5407cc073074295c75ca6d5f445b057d7c4b67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(OutilsGeomTikz.sty) \
texlive-outilsgeomtikz"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(nicefrac.sty) \
tex(pgffor.sty) \
tex(simplekv.sty) \
tex(tikz.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
