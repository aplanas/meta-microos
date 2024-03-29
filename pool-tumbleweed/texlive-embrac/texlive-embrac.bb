SUMMARY = "Upright brackets in emphasised text"
DESCRIPTION = "The package redefines the commands \\emph and \\textit so that \
parentheses and square brackets are typeset in an upright font \
in their arguments. The package requires expl3 from the \
l3kernel bundle, and xparse and l3keys2e from the l3packages \
bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9asvn57814"

RPM_NAME = "texlive-embrac-2023.209.0.0.9asvn57814-54.2.noarch.rpm"
RPM_HASH = "25b1d2d4f9e0894b7863fa32c76bcc30b3a59174c69e084bbf5a67492640847ca1b99703603fe670d27342cb7938c2f03c83b988bd0f8ac83fd72da287734ba5"
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
