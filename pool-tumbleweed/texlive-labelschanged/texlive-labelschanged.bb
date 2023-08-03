SUMMARY = "Identify labels which cause endless 'may have changed' warnings"
DESCRIPTION = "Several conditions can cause LaTeX labels to keep changing, no \
matter how many times a document is recompiled. This package \
helps diagnose the cause of repeated 'Label(s) may have \
changed' warnings. The names and before/after definitions of \
changing labels are printed at the end of each compile. \
Multiply-defined labels are printed as well."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn46040"

RPM_NAME = "texlive-labelschanged-2023.209.1.0svn46040-56.1.noarch.rpm"
RPM_HASH = "2830ea5d9b51a9b985a11d3286836b7475b3bed337fa97ac933a31549d0e9f2cf861d3a8c89e20aedfbf7147d47023ec7328f98a4ae14ebd8fbf2ba9717e00fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-labelschanged.sty \
texlive-labelschanged"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
