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

PV = "2023.201.1.0svn30042"

RPM_NAME = "texlive-aramaic-serto-2023.201.1.0svn30042-54.1.noarch.rpm"
RPM_HASH = "5edd702234d69c2e26412da0ed7b1cab586c0d6db8a3c82eb623a5cf73b2b9f03458a36f4cbf8a225eafd3896a9f9ef7710ae02a826b28785e4751140635c1b1"
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

RDEPENDS:${PN} += "/bin/sh \
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
