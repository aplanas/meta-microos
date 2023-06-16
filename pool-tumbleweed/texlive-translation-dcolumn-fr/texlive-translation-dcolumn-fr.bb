SUMMARY = "French translation of the documentation of dcolumn"
DESCRIPTION = "A French translation of the documentation of dcolumn."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn24345"

RPM_NAME = "texlive-translation-dcolumn-fr-2023.201.svn24345-52.1.noarch.rpm"
RPM_HASH = "99afcfcd8b6efcb3549417ae85675b3649661e95c689ee35a92e3e7df4a3af711fbf17412d8c75df7e8e1dff4889e693dd92dd4f6e83c1424449fc3fc22a8f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-dcolumn-fr"

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
