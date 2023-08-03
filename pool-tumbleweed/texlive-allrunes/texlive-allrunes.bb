SUMMARY = "Fonts and LaTeX package for almost all runes"
DESCRIPTION = "This large collection of fonts (in Adobe Type 1 format), with \
the LaTeX package gives access to almost all runes ever used in \
Europe. The bundle covers not only the main forms but also a \
lot of varieties."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.1svn42221"

RPM_NAME = "texlive-allrunes-2023.209.2.1.1svn42221-55.1.noarch.rpm"
RPM_HASH = "8085f5dd3a5d7a5c33f14a29eca016a00e06d3e28e4629cec75ec4aff9e20c98643f9c6f028949a44a37c00be6b49dba40b821ae770faa57227c72bcf1f8be21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-allrunes.map \
tex-allrunes.sty \
tex-ara.fd \
tex-arc.fd \
tex-arl.fd \
tex-arm.fd \
tex-arn.fd \
tex-art.fd \
texlive-allrunes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-updmap.cfg \
texlive \
texlive-allrunes-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
