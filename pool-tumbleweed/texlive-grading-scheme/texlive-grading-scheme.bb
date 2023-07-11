SUMMARY = "Typeset grading schemes in tabular format"
DESCRIPTION = "This package aims at an easy-to-use interface to typeset \
grading schemes in tabular format, in particular \
grading-schemes of exercises of mathematical olympiads where \
multiple solutions have to be graded and might offer mutual \
exclusive ways of receiving points."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn62505"

RPM_NAME = "texlive-grading-scheme-2023.201.0.0.1.1svn62505-53.2.noarch.rpm"
RPM_HASH = "9f3214a1509b9ad3a78bba9a4004314681b74c5c262d230f77b9fe155e41289459a3bc8756e9f67b3c2f543f5026fdb6e00021ce1fb94947cac75635765d3394"
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
