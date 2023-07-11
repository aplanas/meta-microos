SUMMARY = "Trees using epic and eepic macros"
DESCRIPTION = "The package recursively draws trees: each subtree is defined in \
a 'bundle' environment, with a set of leaves described by \
\\chunk macros. A chunk may have a bundle environment inside it."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn15878"

RPM_NAME = "texlive-ecltree-2023.201.1.1asvn15878-53.2.noarch.rpm"
RPM_HASH = "d42cbb6a9c2ac0a6476490fa1baf30a9aec359869fd1a034bf884a376aed2a6c6067b12b61abc966946c164abd7883acc49f2336a81b893dec8dd80d27102568"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ecltree.sty \
texlive-ecltree"

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
