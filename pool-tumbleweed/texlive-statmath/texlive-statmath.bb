SUMMARY = "A LaTeX package for simple use of statistical notation"
DESCRIPTION = "The package offers anumber of notational conventions to be used \
in applied and theoretical papers in statistics which are \
currently lacking in the popular amsmath package. The seasoned \
LaTeX user will see that the provided commands are simple, \
almost trivial, but will hopefully offer less cluttered \
preambles as well as a welcome help for novice users."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn46925"

RPM_NAME = "texlive-statmath-2023.209.0.0.1svn46925-58.1.noarch.rpm"
RPM_HASH = "d38864612b39c2c8d94bf41bc83629e84959e9de6d7b281e74ca0723fb67ee11833d60babf512c73ad70ad15b54e04ec4f0c5c0300fb578197dea3c8de8baff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-statmath.sty \
texlive-statmath"

RDEPENDS:${PN} += "/usr/bin/sh \
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
