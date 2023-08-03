SUMMARY = "Upright brackets in emphasised text"
DESCRIPTION = "The package redefines the commands \\emph and \\textit so that \
parentheses and square brackets are typeset in an upright font \
in their arguments. The package requires expl3 from the \
l3kernel bundle, and xparse and l3keys2e from the l3packages \
bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9asvn57814"

RPM_NAME = "texlive-embrac-2023.209.0.0.9asvn57814-54.1.noarch.rpm"
RPM_HASH = "0bb56bae2f5d92b67a8504c9657ff5960953813c08d59b6758b1186c761cbf038d24fa7dba7410a7ed8008a9ee5c730868a5d429472fcd597d6eda05b605c26b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-embrac.sty \
texlive-embrac"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
