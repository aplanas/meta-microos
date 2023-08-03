SUMMARY = "Display list item counter as regular pattern of bullets"
DESCRIPTION = "The bullcntr package defines the command bullcntr, which may be \
thought of as an analogue of the \\fnsymbol command: like the \
latter, it displays the value of a counter lying between 1 and \
9, but uses, for the purpose, a regular pattern of bullets."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.04svn15878"

RPM_NAME = "texlive-bullcntr-2023.209.0.0.04svn15878-53.1.noarch.rpm"
RPM_HASH = "7a93c1f99bda1c54c6ef13f3289cf1022cff0c958b0a501b042329a7caf2c988b259ae1605405bf30581649068cac1a357ed51f98358ef006f604d6e8684e08c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bullcntr.sty \
tex-bullenum.sty \
texlive-bullcntr"

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
