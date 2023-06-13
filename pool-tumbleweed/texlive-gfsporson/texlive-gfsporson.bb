SUMMARY = "A Greek font, originally from Porson"
DESCRIPTION = "Porson is an elegant Greek font, originally cut at the turn of \
the 19th Century in England. The present version has been \
provided by the Greek Font Society. The font supports the Greek \
alphabet only. LaTeX support is provided, using the LGR \
encoding."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn18651"

RPM_NAME = "texlive-gfsporson-2023.201.1.01svn18651-52.1.noarch.rpm"
RPM_HASH = "9b3966a437b8b14ca6c7515e04dbac6c5ccbb23513d3f875c3304e85c7025a1df1a81b5fca950f51fcfa6050e38d8a24ad7b765f6653d2ec30f2ae208737354e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gfsporson.map) \
tex(gfsporson.sty) \
tex(gporsonrg6a.tfm) \
tex(gporsonrg6a.vf) \
tex(gporsonrg6r.tfm) \
tex(lgrporson.fd) \
tex(porsonel.enc) \
texlive-gfsporson"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-gfsporson-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
