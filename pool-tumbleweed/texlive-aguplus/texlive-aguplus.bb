SUMMARY = "Styles for American Geophysical Union"
DESCRIPTION = "This bundle started as an extension to the AGU's own published \
styles, providing extra facilities and improved usability. The \
AGU now publishes satisfactory LaTeX materials of its own; the \
author of aguplus recommends that users switch to using the \
official distribution."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6bsvn17156"

RPM_NAME = "texlive-aguplus-2023.209.1.6bsvn17156-55.1.noarch.rpm"
RPM_HASH = "2ce1c32ff9d27030112da9002e1ff5cadd04d1b0b3e35c9f714878c338a81bb3689cd1f63f794525bd78263c35375ba9fc477c92dc45d74623c94bec33799129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aguplus.cls \
tex-aguplus.sty \
tex-agupp.sty \
texlive-aguplus"

RDEPENDS:${PN} += "/usr/bin/sh \
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
