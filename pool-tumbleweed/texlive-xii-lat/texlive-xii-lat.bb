SUMMARY = "Christmas silliness (Latin)"
DESCRIPTION = "This is the plain TeX file xii-lat.tex. Call 'pdftex \
xii-lat.tex' to produce a (perhaps) surprising typeset \
document."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45805"

RPM_NAME = "texlive-xii-lat-2023.209.svn45805-53.1.noarch.rpm"
RPM_HASH = "453f350438c16e8d58f12a4fe9bce407b77c11e708d7d7ddd89dd7260943b8670555621e86eff8fc30386c18015a23b485dd473ec838d4e65620a953c91b0c5c"
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
