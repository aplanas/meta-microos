SUMMARY = "Print Tibetan text in the classic pecha layout style"
DESCRIPTION = "The pecha class provides an environment for writing Tibetan on \
LaTeX2e in the traditional Tibetan Pecha layout used for \
spiritual or philosophical texts, using the cTib4TeX package by \
Oliver Corff. It provides features like headers in different \
languages, page numbering in Tibetan and more."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-pecha-2023.209.0.0.1svn15878-52.1.noarch.rpm"
RPM_HASH = "bd3c30670a6d369897030f7ef87c670a6793fdb4dde63eb9b31c9d6f1b459f1d1ccb09a0e6a6fba7d672a1dc27d9410a518bdd22e2a17e27fd4c9f852c01410c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ctibmantra.sty \
tex-pecha.cls \
texlive-pecha"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ctib.sty \
tex-relsize.sty \
tex-rotating.sty \
tex-times.sty \
tex-twoopt.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
