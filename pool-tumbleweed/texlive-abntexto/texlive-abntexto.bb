SUMMARY = "LaTeX class for formatting academic papers in ABNT standards"
DESCRIPTION = "This is a LaTeX class created for Brazilian students to \
facilitate the use of standards from the Associacao Brasileira \
de Normas Tecnicas (ABNT) in academic works like TCCs, \
dissertations, theses."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.0.0_alphasvn65705"

RPM_NAME = "texlive-abntexto-2023.209.2.0.0_alphasvn65705-55.1.noarch.rpm"
RPM_HASH = "9385377e20fd3ea51089a4988aa1afda699aa53cd2a295053887313a53f7dbb144cc4d31cad8b1e95189774d542dbccd7787b636c814e8a8008e7514624c7e5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abntexto.cls \
texlive-abntexto"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
