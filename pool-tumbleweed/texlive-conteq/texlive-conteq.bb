SUMMARY = "Typeset multiline continued equalities"
DESCRIPTION = "The package provides an environment conteq, which will lay out \
systems of continued equalities (or inequalities). Several \
variant layouts of the equalities are provided, and the user \
may define their own. The package is written using LaTeX 3 \
macros."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.1.1svn37868"

RPM_NAME = "texlive-conteq-2023.204.0.0.1.1svn37868-54.1.noarch.rpm"
RPM_HASH = "4c724af65d064274d92f38a95bbe7323db35ac6d05ad792e4bf36edf6cab06cb4025d8644510a7a2b2c13dab33099cf15a7e6251e8e020293dea6e979563a400"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-conteq.sty \
texlive-conteq"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-environ.sty \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
