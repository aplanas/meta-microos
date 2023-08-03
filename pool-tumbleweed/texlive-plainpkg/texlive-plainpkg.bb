SUMMARY = "A minimal method for making generic packages"
DESCRIPTION = "The package provides a minimal method for making generic (i.e., \
TeX-format-independent) packaged, combining maybeload \
functionality, fallback definitions for LaTeX \\ProvidesPackage \
and \\RequirePackage functionality, and handling of arbitrary \
(multiple) 'private letters' (analagous LaTeX packages' use of \
'@') in nested package files. The documentation contains a \
central reference for making and using generic packages based \
on the package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4asvn27765"

RPM_NAME = "texlive-plainpkg-2023.209.0.0.4asvn27765-52.1.noarch.rpm"
RPM_HASH = "5327a965ef7c507d098f6713aa41a0e440473bff2d4ef74667f411468e06df082ee8a0ffef777a433757eea80d01b9522fffadfd3143e9ade9ece9d660e4c7ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plainpkg.tex \
texlive-plainpkg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
