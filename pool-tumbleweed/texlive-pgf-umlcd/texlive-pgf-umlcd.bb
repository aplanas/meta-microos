SUMMARY = "Some LaTeX macros for UML Class Diagrams"
DESCRIPTION = "Some LaTeX macros for UML Class Diagrams."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.3svn63386"

RPM_NAME = "texlive-pgf-umlcd-2023.201.0.0.3svn63386-51.1.noarch.rpm"
RPM_HASH = "5a62bcbd437e4db50964bc49a60d47daf273739a7634c8740fddab77faf94c6d31d4bc498b1bf558a931a75e664e89da8f85bcb018a4815aecdfd05dc9605a0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgf-umlcd.sty \
tex-tikzlibraryumlcd.code.tex \
texlive-pgf-umlcd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
