SUMMARY = "Drawing TQFT diagrams with TikZ/PGF"
DESCRIPTION = "The package defines some node shapes useful for drawing TQFT \
diagrams with TikZ/PGF. That is, it defines highly customisable \
shapes that look like cobordisms between circles, such as those \
used in TQFT and other mathematical diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn44455"

RPM_NAME = "texlive-tqft-2023.201.2.1svn44455-52.1.noarch.rpm"
RPM_HASH = "267b541b8ad025894dd82aaf54decb5fd27c513b4ccb8bc179f3f4544a7d2743f052385f3ca8050cce3c0e3947daaf51a5ab7df3be56a1d2161286382626ba1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarytqft.code.tex \
tex-tqft.sty \
texlive-tqft"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgf.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
