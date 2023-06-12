SUMMARY = "A loop facility for Generic TeX"
DESCRIPTION = "The package provides the \\multido command, which was originally \
designed for use with PSTricks. Fixed-point arithmetic is used \
when working on the loop variable, so that the package is \
equally applicable in graphics applications like PSTricks as it \
is with the more common integer loops."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.42svn18302"

RPM_NAME = "texlive-multido-2023.201.1.42svn18302-54.1.noarch.rpm"
RPM_HASH = "8c4411838fc138acf8984f967231840cd736134e81763318877b363d96ff884b821a5bcfa2613bd4378e751c1b99e1e4c96c4809ac6d5a0f206ea95398a4b202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(multido.sty) \
tex(multido.tex) \
texlive-multido"
RDEPENDS:${PN} += "/bin/sh \
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
