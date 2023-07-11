SUMMARY = "Library for genealogytree aiming at large trees"
DESCRIPTION = "The main goal of this package is to offer additional database \
fields and formats for the genealogytree package, particularly \
for typesetting large trees. The package depends on \
genealogytree and etoolbox."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2bsvn49062"

RPM_NAME = "texlive-gtrlib-largetrees-2023.201.1.2bsvn49062-53.2.noarch.rpm"
RPM_HASH = "c03eb67a59e0f5dd69706d4fb49d6d7f55160df50f52152ad631fde77623ed9abf8310a83038aa9f33323598b5d5ad4519857e664fdc0fac9f1b590ff8b729b9"
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
