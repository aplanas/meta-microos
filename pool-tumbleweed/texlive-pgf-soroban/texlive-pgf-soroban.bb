SUMMARY = "Create images of the soroban using TikZ/PGF"
DESCRIPTION = "The package makes it possible to create pictures of the soroban \
(Japanese abacus) using PGF/TikZ"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn32269"

RPM_NAME = "texlive-pgf-soroban-2023.209.1.1svn32269-52.1.noarch.rpm"
RPM_HASH = "0f576033ac97b1f5d91d1ab40873c69670319b4148f0cbae0d7fcbc420cb666d0b7cd9cd9effd3ac7beb1a6c69bcf22ea4ed57cb358c65ed1073333e3d4da5bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgf-soroban.sty \
texlive-pgf-soroban"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
