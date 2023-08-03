SUMMARY = "Trees using epic and eepic macros"
DESCRIPTION = "The package recursively draws trees: each subtree is defined in \
a 'bundle' environment, with a set of leaves described by \
\\chunk macros. A chunk may have a bundle environment inside it."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn15878"

RPM_NAME = "texlive-ecltree-2023.209.1.1asvn15878-54.1.noarch.rpm"
RPM_HASH = "8089d6b941094b154e031f14aa6c3b6199edf09a5dfa505fa409c1a8f0b4244abde890a9de2fe495ffaccbd5d1d51ca30586150a287e4932df95d6b352ae94fd"
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
