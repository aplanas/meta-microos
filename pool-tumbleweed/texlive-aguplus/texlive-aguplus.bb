SUMMARY = "Styles for American Geophysical Union"
DESCRIPTION = "This bundle started as an extension to the AGU's own published \
styles, providing extra facilities and improved usability. The \
AGU now publishes satisfactory LaTeX materials of its own; the \
author of aguplus recommends that users switch to using the \
official distribution."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6bsvn17156"

RPM_NAME = "texlive-aguplus-2023.201.1.6bsvn17156-54.1.noarch.rpm"
RPM_HASH = "8848005abb337e050d8896f748a6371e2cfe52abb546ce854d7bc50346c345811dc22e77e4e67cd3387a2a36befcd45051f9a5056d7b9e14c948511927489225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aguplus.cls \
tex-aguplus.sty \
tex-agupp.sty \
texlive-aguplus"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
