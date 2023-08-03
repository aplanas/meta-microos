SUMMARY = "Typeset the German chess magazine 'Die Schwalbe'"
DESCRIPTION = "The package is based on chess-problem-diagrams, which in its \
turn has a dependency on the bartel-chess-fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.12svn63708"

RPM_NAME = "texlive-schwalbe-chess-2023.209.2.12svn63708-54.1.noarch.rpm"
RPM_HASH = "8c0ccdf97c7fdcfac54c21f700c1724db370be1cf6294f1184b93f19a5aacd8a382a0fdc7d94a9c5d93d3d610dabe59f650026ec05b15ed31c4f1187bc3f14d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-schwalbe.cls \
tex-schwalbe.sty \
tex-swruler.sty \
texlive-schwalbe-chess"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-article.cls \
tex-babel.sty \
tex-calc.sty \
tex-cpdparse.sty \
tex-diagram.sty \
tex-eurosym.sty \
tex-fontenc.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-multicol.sty \
tex-paralist.sty \
tex-times.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
