SUMMARY = "Typeset grading schemes in tabular format"
DESCRIPTION = "This package aims at an easy-to-use interface to typeset \
grading schemes in tabular format, in particular \
grading-schemes of exercises of mathematical olympiads where \
multiple solutions have to be graded and might offer mutual \
exclusive ways of receiving points."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn62505"

RPM_NAME = "texlive-grading-scheme-2023.209.0.0.1.1svn62505-54.1.noarch.rpm"
RPM_HASH = "6e13118fb2693b1137f80765efd6a46353bbf5b2fc317337db89a13e0b889655841dc8fadb06d3a1030e7dc4431ecacbf242fe01ac02def4ba8ebb8de7322375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grading-scheme.sty \
texlive-grading-scheme"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-multirow.sty \
tex-rotating.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
