SUMMARY = "A font with the images of the counties of Romania"
DESCRIPTION = "This package provides a Type 1 font with images of the 42 \
counties of Romania, constructed using a general method which \
is described in detail in the documentation. The package name \
is an abbreviation of 'judetele Romaniei' (= counties of \
Romania)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn56895"

RPM_NAME = "texlive-rojud-2023.209.1.2svn56895-54.1.noarch.rpm"
RPM_HASH = "5b1d98033f13bec53e86d620575feab45ad0dd295e3dd7618f9118606501c34b9611e5093baaa0420515ddda861dfc849e3aec0eaeb6e7296d109adebfb97453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot1rojud.fd \
tex-rojud.map \
tex-rojud.sty \
tex-rojud.tfm \
tex-turojud.fd \
texlive-rojud"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-rojud-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
