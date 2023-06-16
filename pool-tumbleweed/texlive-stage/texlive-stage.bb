SUMMARY = "A LaTeX class for stage plays"
DESCRIPTION = "Stage.cls is a LaTeX class for creating plays of any length in \
a standard manuscript format for production and submission."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn62929"

RPM_NAME = "texlive-stage-2023.201.1.03svn62929-57.1.noarch.rpm"
RPM_HASH = "4e21d0f110440751e50f10938aeaef7eb71ace271137992456c61b8c9c92b700906d69c3ca3a8e78c01b4b0f463d51ce584db0f67d778d7b18e1acb85e0173df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stage.cls \
texlive-stage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-changepage.sty \
tex-extramarks.sty \
tex-fancyhdr.sty \
tex-ifthen.sty \
tex-needspace.sty \
tex-parskip.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
