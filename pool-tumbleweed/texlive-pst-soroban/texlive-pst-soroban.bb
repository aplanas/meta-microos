SUMMARY = "Draw a Soroban using PSTricks"
DESCRIPTION = "The package uses PSTricks to draw a Japanese abacus, or \
soroban. The soroban is still used in Japan today."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-pst-soroban-2023.209.1.0svn15878-54.2.noarch.rpm"
RPM_HASH = "cef3a5bfd5618df465abd6b755b9d6fe2f79a9330b409e129ce988998c7834ae405d5537f7503b811426066ea445997d1a49662998397f882569f6b4b9b0f403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-soroban.sty \
texlive-pst-soroban"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-pstricks-add.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
