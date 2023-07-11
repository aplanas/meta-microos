SUMMARY = "Christmas silliness (Latin)"
DESCRIPTION = "This is the plain TeX file xii-lat.tex. Call 'pdftex \
xii-lat.tex' to produce a (perhaps) surprising typeset \
document."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45805"

RPM_NAME = "texlive-xii-lat-2023.201.svn45805-52.2.noarch.rpm"
RPM_HASH = "d5218429b238c71ca2301823282d593471962e37ccfdb2552bc76ec409d4e1d60f060ff943a75fac216844d208a07f09bed91906f0ad439d0a17a3064897f6f8"
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
