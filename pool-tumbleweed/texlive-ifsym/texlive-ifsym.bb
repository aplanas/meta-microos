SUMMARY = "A collection of symbols"
DESCRIPTION = "A set of symbol fonts, written in Metafont, offering \
(respectively) clock-face symbols, geometrical symbols, weather \
symbols, mountaineering symbols, electronic circuit symbols and \
a set of miscellaneous symbols. A LaTeX package is provided, \
that allows the user to load only those symbols needed in a \
document."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24868"

RPM_NAME = "texlive-ifsym-2023.209.svn24868-54.1.noarch.rpm"
RPM_HASH = "0047638a7cdebd23e4a02c682bac7505ff780314955f8b14bf231e09484bc317cfbda20ec0f1c3d643b3ebf39018442fa0c1c1d9b03758ef04f3e34472cb9689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifclk10.tfm \
tex-ifclkb10.tfm \
tex-ifgeo10.tfm \
tex-ifgeob10.tfm \
tex-ifgeobn10.tfm \
tex-ifgeobw10.tfm \
tex-ifgeon10.tfm \
tex-ifgeow10.tfm \
tex-ifsym.sty \
tex-ifsym10.tfm \
tex-ifsymb10.tfm \
tex-ifsymbi10.tfm \
tex-ifsymi10.tfm \
tex-ifwea10.tfm \
tex-ifweab10.tfm \
tex-uifblk.fd \
tex-uifclk.fd \
tex-uifgeo.fd \
tex-uifsym.fd \
tex-uifwea.fd \
texlive-ifsym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
