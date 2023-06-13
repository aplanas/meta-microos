SUMMARY = "Typeset natural deduction proofs"
DESCRIPTION = "The package provides commands to typeset proofs in the style \
used by Jaskowski, or that of Kalish and Montague."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn32693"

RPM_NAME = "texlive-natded-2023.201.0.0.1svn32693-54.1.noarch.rpm"
RPM_HASH = "5543a27731f9a7a1b01eccd9655c1e01396afe48efd000c12fc7941f848772b48bbf89f516a0ae398ef72eec5a53748dc5259f8cdcab02ac0af0d7489b8c7dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(natded.sty) \
texlive-natded"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
