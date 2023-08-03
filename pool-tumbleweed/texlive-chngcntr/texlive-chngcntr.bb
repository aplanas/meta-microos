SUMMARY = "Change the resetting of counters"
DESCRIPTION = "Defines commands \\counterwithin (which sets up a counter to be \
reset when another is incremented) and \\counterwithout (which \
unsets such a relationship)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn47577"

RPM_NAME = "texlive-chngcntr-2023.209.1.1asvn47577-54.1.noarch.rpm"
RPM_HASH = "5cd1bd9b4991d53f828a0728d5173cad5db8cf3b5a2dc671c171af4f2967331f1bcdcb819f43ace8206c077393e8944554758daa01addff7af1f506ff172189d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chngcntr.sty \
texlive-chngcntr"

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
