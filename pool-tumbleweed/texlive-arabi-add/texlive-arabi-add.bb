SUMMARY = "Using hyperref and bookmark packages with arabic and farsi languages"
DESCRIPTION = "This package takes advantage of some of the possibilities that \
hyperref and bookmark packages offer when you create a table of \
contents for Arabic texts created by the arabi package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn37709"

RPM_NAME = "texlive-arabi-add-2023.201.1.0svn37709-54.1.noarch.rpm"
RPM_HASH = "a6144c4c4e1b720a5c2b525d86ec3275caacf3c9d8fb5452f4e327c6c2228c68b89a98e5127a7b7db35e704e703877714a45243f138fa53bb72a23b44e1941e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arabi-add.sty \
texlive-arabi-add"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-atveryend.sty \
tex-bookmark.sty \
tex-datatool.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
