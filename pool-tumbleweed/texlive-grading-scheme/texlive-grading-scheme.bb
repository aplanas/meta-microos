SUMMARY = "Typeset grading schemes in tabular format"
DESCRIPTION = "This package aims at an easy-to-use interface to typeset \
grading schemes in tabular format, in particular \
grading-schemes of exercises of mathematical olympiads where \
multiple solutions have to be graded and might offer mutual \
exclusive ways of receiving points."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn62505"

RPM_NAME = "texlive-grading-scheme-2023.201.0.0.1.1svn62505-53.1.noarch.rpm"
RPM_HASH = "211ed0595a851b12fe29fe63abce8f7c6f6b32235cc8d6c3a641d529f20e9f952931cb89e9d7b2da786b22226024ae2327caaef7656e109b6c5c9b1dbc87ec17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grading-scheme.sty \
texlive-grading-scheme"

RDEPENDS:${PN} += "/bin/sh \
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
