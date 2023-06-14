SUMMARY = "A LaTeX package for simple use of statistical notation"
DESCRIPTION = "The package offers anumber of notational conventions to be used \
in applied and theoretical papers in statistics which are \
currently lacking in the popular amsmath package. The seasoned \
LaTeX user will see that the provided commands are simple, \
almost trivial, but will hopefully offer less cluttered \
preambles as well as a welcome help for novice users."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn46925"

RPM_NAME = "texlive-statmath-2023.201.0.0.1svn46925-57.1.noarch.rpm"
RPM_HASH = "7198007dfb6c037b345b2e222da677ba447bbb1366d33d7d64c762d99ff0cfec5829ba89b40c1816fce401c3efe3d45dc7a3ca4b035f8eae9c3ddd6f8becfafd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-statmath.sty \
texlive-statmath"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-bm.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
