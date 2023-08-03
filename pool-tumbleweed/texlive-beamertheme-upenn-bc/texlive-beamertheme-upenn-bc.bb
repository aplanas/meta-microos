SUMMARY = "Beamer themes for Boston College and the University of Pennsylvania"
DESCRIPTION = "Beamer themes in the colors of the University of Pennsylvania, \
USA, and Boston College, USA. Both were tested for the \
presentation theme 'Warsaw'. Please note that these color \
themes are neither official nor exact! The colours are \
approximated from the universities' style guidelines and \
websites, and slightly modified where necessary to generate an \
appealing look. The universities neither endorse, nor provide \
any support for, these color themes. I give no warranty for the \
code."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn29937"

RPM_NAME = "texlive-beamertheme-upenn-bc-2023.209.1.0svn29937-54.1.noarch.rpm"
RPM_HASH = "dc1c3696b366a8681e6dcc701c186d2a995c5acf8205929cd75f9998d40457576f001e56e4b5a9d64a70e822b4ee63c9ede6047d295295395a6ff69adaa92354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemegoeagles.sty \
tex-beamercolorthemepenn.sty \
texlive-beamertheme-upenn-bc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
