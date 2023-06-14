SUMMARY = "Create images of the soroban using TikZ/PGF"
DESCRIPTION = "The package makes it possible to create pictures of the soroban \
(Japanese abacus) using PGF/TikZ"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn32269"

RPM_NAME = "texlive-pgf-soroban-2023.201.1.1svn32269-51.1.noarch.rpm"
RPM_HASH = "af6431d78f620a5500bb8a2b5229accf7cb3a2039d40b035ef97d034702ca4f449fdf28933dde16a5cd76739532f656cb772b41bc48eda338899545ec4cb06c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgf-soroban.sty \
texlive-pgf-soroban"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
