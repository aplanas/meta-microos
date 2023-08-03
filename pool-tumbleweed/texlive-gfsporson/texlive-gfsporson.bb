SUMMARY = "A Greek font, originally from Porson"
DESCRIPTION = "Porson is an elegant Greek font, originally cut at the turn of \
the 19th Century in England. The present version has been \
provided by the Greek Font Society. The font supports the Greek \
alphabet only. LaTeX support is provided, using the LGR \
encoding."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn18651"

RPM_NAME = "texlive-gfsporson-2023.209.1.01svn18651-53.1.noarch.rpm"
RPM_HASH = "dad53bc08977992d5ce0ce2099377222f811d84590713b2579696a22e23266a8160ee39cfb141414a3422cc4ca44e05677794ae78eb29de54951aaf6caa60c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gfsporson.map \
tex-gfsporson.sty \
tex-gporsonrg6a.tfm \
tex-gporsonrg6a.vf \
tex-gporsonrg6r.tfm \
tex-lgrporson.fd \
tex-porsonel.enc \
texlive-gfsporson"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-gfsporson-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
