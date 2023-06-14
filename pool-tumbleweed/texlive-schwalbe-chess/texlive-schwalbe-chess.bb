SUMMARY = "Typeset the German chess magazine 'Die Schwalbe'"
DESCRIPTION = "The package is based on chess-problem-diagrams, which in its \
turn has a dependency on the bartel-chess-fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.12svn63708"

RPM_NAME = "texlive-schwalbe-chess-2023.201.2.12svn63708-53.1.noarch.rpm"
RPM_HASH = "e7208af896b6c67d8a366b3e2e58d1b13fbc41bc5ef5ec8815040f496375c320ea258df33b63b9d185a211710d7f0078b61b99abe891e5e0ee52025e3f088632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-schwalbe.cls \
tex-schwalbe.sty \
tex-swruler.sty \
texlive-schwalbe-chess"

RDEPENDS:${PN} += "/bin/sh \
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
