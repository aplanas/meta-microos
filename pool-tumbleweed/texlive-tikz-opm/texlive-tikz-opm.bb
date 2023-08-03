SUMMARY = "Typeset OPM diagrams"
DESCRIPTION = "Typeset OPM (Object-Process Methodology) diagrams using LaTeX \
and PGF/TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn32769"

RPM_NAME = "texlive-tikz-opm-2023.209.0.0.1.1svn32769-53.1.noarch.rpm"
RPM_HASH = "5b4ceadc8d62348e94d74e7c3963416486f7fd9cf2db34acdff40eaa3071c66e2bd8ec407edb34dad93cc51fd0903bdb47f056f18a9f7d918ea529ac6fbdca7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-opm.sty \
texlive-tikz-opm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-makeshape.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
