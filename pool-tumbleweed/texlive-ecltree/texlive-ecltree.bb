SUMMARY = "Trees using epic and eepic macros"
DESCRIPTION = "The package recursively draws trees: each subtree is defined in \
a 'bundle' environment, with a set of leaves described by \
\\chunk macros. A chunk may have a bundle environment inside it."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn15878"

RPM_NAME = "texlive-ecltree-2023.209.1.1asvn15878-54.2.noarch.rpm"
RPM_HASH = "8e22e5b8d6dd504615fcbf04c454775ea20107644bfccccb352c9e2a507a9ad8cb7b0d52b1409f9723d572465051d146a2379e511938b999536aa59ef3cb1bf4"
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
