SUMMARY = "Complex labelling with LaTeX"
DESCRIPTION = "The package provides a complex labelling scheme. It is designed \
to support the needs of the author's chemschemex package"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn46736"

RPM_NAME = "texlive-fancylabel-2023.209.1.1svn46736-53.1.noarch.rpm"
RPM_HASH = "e43777ee889a6599b1de768fa7b8124f3188dc4821e64656ae2fd115c7fff5b064772f217d247c292d719f0c1b5133f53a010d9307e371371e6a8d1173773a15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancylabel.sty \
texlive-fancylabel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-suffix.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
