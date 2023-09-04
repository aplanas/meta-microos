SUMMARY = "Christmas silliness (Latin)"
DESCRIPTION = "This is the plain TeX file xii-lat.tex. Call 'pdftex \
xii-lat.tex' to produce a (perhaps) surprising typeset \
document."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45805"

RPM_NAME = "texlive-xii-lat-2023.209.svn45805-53.2.noarch.rpm"
RPM_HASH = "305bc69f5893114d8453057119444b16e75049b69cf05f106bdca2ff411ecf95133ba5ed73097c2309906e8ae500a25cf207aa4937279ac057243829c093020c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xii-lat"

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
