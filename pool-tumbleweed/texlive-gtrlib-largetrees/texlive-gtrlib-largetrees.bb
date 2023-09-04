SUMMARY = "Library for genealogytree aiming at large trees"
DESCRIPTION = "The main goal of this package is to offer additional database \
fields and formats for the genealogytree package, particularly \
for typesetting large trees. The package depends on \
genealogytree and etoolbox."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2bsvn49062"

RPM_NAME = "texlive-gtrlib-largetrees-2023.209.1.2bsvn49062-54.2.noarch.rpm"
RPM_HASH = "970793f3b2d26584495b5d7db501fbf073058aaeae3a543b9a3daa7d8d0d28344f361504b4dd78f103ec1952bc84a5d7463fc13c885c691106a2457fdbd1ac89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gtrlib.largetrees.code.tex \
tex-gtrlib.largetrees.sty \
texlive-gtrlib-largetrees"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-genealogytree.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
