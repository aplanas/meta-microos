SUMMARY = "Christmas silliness (English)"
DESCRIPTION = "This is the plain TeX file xii.tex. Call 'pdftex xii.tex' to \
produce a (perhaps) surprising typeset document."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45804"

RPM_NAME = "texlive-xii-2023.201.svn45804-52.2.noarch.rpm"
RPM_HASH = "7f9b9d046f8a62f493e30d0a2937dda3f2e1a4caac3585a72d0b5cbdb96767c43d3e7a7dfea62430f765554970ef5bf4e9111efa9b300e0567b7af9ff4031328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xii"

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
