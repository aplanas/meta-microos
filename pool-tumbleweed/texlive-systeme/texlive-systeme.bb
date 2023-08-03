SUMMARY = "Format systems of equations"
DESCRIPTION = "The package allows you to enter systems of equations or \
inequalities in an intuitive way, and produces typeset output \
where the terms and signs are aligned vertically. The package \
works with plain TeX or LaTeX, but e-TeX is required. Cette \
petite extension permet de saisir des systemes d'equations ou \
inequations de facon intuitive, et produit un affichage ou les \
termes et les signes sont alignes verticalement."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.34svn55015"

RPM_NAME = "texlive-systeme-2023.209.0.0.34svn55015-58.1.noarch.rpm"
RPM_HASH = "fc44e45eaf01c08bcbaec9f72d34e9a4afe6858c2da2b3466bea8cb3cbcae36eeeeefcf76c98882312ae1a3e39795098669e05cf37c6baec0981363719b09eec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-systeme.sty \
tex-systeme.tex \
texlive-systeme"

RDEPENDS:${PN} += "/usr/bin/sh \
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
