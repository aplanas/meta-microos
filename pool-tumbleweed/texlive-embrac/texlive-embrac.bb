SUMMARY = "Upright brackets in emphasised text"
DESCRIPTION = "The package redefines the commands \\emph and \\textit so that \
parentheses and square brackets are typeset in an upright font \
in their arguments. The package requires expl3 from the \
l3kernel bundle, and xparse and l3keys2e from the l3packages \
bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9asvn57814"

RPM_NAME = "texlive-embrac-2023.201.0.0.9asvn57814-53.2.noarch.rpm"
RPM_HASH = "44a6e7ee3b5751f11569da6529ec7455d17ef1bec700a8822ce1b90d31243a8ba9ae0add484e8fbd78f47fa72d9644f8018be9423096556903ad58aeab6108fd"
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
