SUMMARY = "Display list item counter as regular pattern of bullets"
DESCRIPTION = "The bullcntr package defines the command bullcntr, which may be \
thought of as an analogue of the \\fnsymbol command: like the \
latter, it displays the value of a counter lying between 1 and \
9, but uses, for the purpose, a regular pattern of bullets."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.04svn15878"

RPM_NAME = "texlive-bullcntr-2023.201.0.0.04svn15878-52.1.noarch.rpm"
RPM_HASH = "0479674d36e06885b8be4b5394efbb708987b04cd87b061c8a793c6cc137a01d970d347787c21381eac33f226dc5cd30fcad46ed06ae947805c21035d566e0eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bullcntr.sty \
tex-bullenum.sty \
texlive-bullcntr"

RDEPENDS:${PN} += "/bin/sh \
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
