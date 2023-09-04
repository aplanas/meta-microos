SUMMARY = "Typeset grading schemes in tabular format"
DESCRIPTION = "This package aims at an easy-to-use interface to typeset \
grading schemes in tabular format, in particular \
grading-schemes of exercises of mathematical olympiads where \
multiple solutions have to be graded and might offer mutual \
exclusive ways of receiving points."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn62505"

RPM_NAME = "texlive-grading-scheme-2023.209.0.0.1.1svn62505-54.2.noarch.rpm"
RPM_HASH = "d431ead31859b31f46f4487f4b8682162cdca9437b14d17ab41e4bc6c7bbc2b83b4df4e94000f83c07fcc26e33c3fb63f96b3e9c3b47b1d82c09fbabfcbbd5e7"
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
