SUMMARY = "Library for genealogytree aiming at large trees"
DESCRIPTION = "The main goal of this package is to offer additional database \
fields and formats for the genealogytree package, particularly \
for typesetting large trees. The package depends on \
genealogytree and etoolbox."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2bsvn49062"

RPM_NAME = "texlive-gtrlib-largetrees-2023.209.1.2bsvn49062-54.1.noarch.rpm"
RPM_HASH = "1026b72089c2935837be6ff45d406aad0fb5f16eef25f89ac24a614628174a66c7a49e05d9812e953a0a4e05784625e7eaf2f1d26b52a6ee7db63077be65dc60"
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
