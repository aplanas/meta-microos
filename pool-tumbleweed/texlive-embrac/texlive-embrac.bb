SUMMARY = "Upright brackets in emphasised text"
DESCRIPTION = "The package redefines the commands \\emph and \\textit so that \
parentheses and square brackets are typeset in an upright font \
in their arguments. The package requires expl3 from the \
l3kernel bundle, and xparse and l3keys2e from the l3packages \
bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9asvn57814"

RPM_NAME = "texlive-embrac-2023.201.0.0.9asvn57814-53.1.noarch.rpm"
RPM_HASH = "99bbbe7a6822a126ed5c7b763e6352011e0c7c5e1956bda3a18f759832b324372fc4de2c87eaf4d5a0f01a303085283f2cb6f04f4a328035b7ce0f7e86f0c875"
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
