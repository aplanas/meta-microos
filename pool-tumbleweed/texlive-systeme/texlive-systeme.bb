SUMMARY = "Format systems of equations"
DESCRIPTION = "The package allows you to enter systems of equations or \
inequalities in an intuitive way, and produces typeset output \
where the terms and signs are aligned vertically. The package \
works with plain TeX or LaTeX, but e-TeX is required. Cette \
petite extension permet de saisir des systemes d'equations ou \
inequations de facon intuitive, et produit un affichage ou les \
termes et les signes sont alignes verticalement."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.34svn55015"

RPM_NAME = "texlive-systeme-2023.201.0.0.34svn55015-57.1.noarch.rpm"
RPM_HASH = "774205d6042259d63cbafa752a88e7af3919981d208d02bb8aeb644a5c46b0920311c15eb4d7dc185b45f09e552139e86541c49577a1b8ec655a07fc92755a49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-systeme.sty \
tex-systeme.tex \
texlive-systeme"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
