SUMMARY = "Identify labels which cause endless 'may have changed' warnings"
DESCRIPTION = "Several conditions can cause LaTeX labels to keep changing, no \
matter how many times a document is recompiled. This package \
helps diagnose the cause of repeated 'Label(s) may have \
changed' warnings. The names and before/after definitions of \
changing labels are printed at the end of each compile. \
Multiply-defined labels are printed as well."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn46040"

RPM_NAME = "texlive-labelschanged-2023.201.1.0svn46040-55.1.noarch.rpm"
RPM_HASH = "46bd0c1deb1b0f2281b718f87aedcfdbf26cfd0394888b53ed048d06d9cf648e2939f05564f58a6e00c5e4b4f6a8bbf94b6c4e4a4ce5c48a457d0652870e2c2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(labelschanged.sty) \
texlive-labelschanged"

RDEPENDS:${PN} += "/bin/sh \
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
