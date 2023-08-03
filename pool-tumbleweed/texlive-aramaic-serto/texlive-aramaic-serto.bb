SUMMARY = "Fonts and LaTeX for Syriac written in Serto"
DESCRIPTION = "This package enables (La)TeX users to typeset words or phrases \
(e-TeX extensions are needed) in Syriac (Aramaic) using the \
Serto-alphabet. The package includes a preprocessor written in \
Python (>= 1.5.2) in order to deal with right-to-left \
typesetting for those who do not want to use elatex and to \
choose the correct letter depending on word context \
(initial/medial/final form). Detailed documentation and \
examples are included."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn30042"

RPM_NAME = "texlive-aramaic-serto-2023.209.1.0svn30042-55.1.noarch.rpm"
RPM_HASH = "c6b21ec4227725bb9c59bc50cbe67c3a0125ead629d46f81c9e07411073285a1bf6597081604b42df827461f2f0d41c12ba6a2cf8f050876302004ff98f86c5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-assy.tfm \
tex-assyr.sty \
tex-assyrb10.tfm \
tex-serto.sty \
tex-serto10.tfm \
tex-sertob10.tfm \
tex-syriac.map \
tex-syriac.sty \
tex-uassyr.fd \
tex-userto.fd \
texlive-aramaic-serto"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-aramaic-serto-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
