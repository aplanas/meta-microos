SUMMARY = "Monthly Notices of the Royal Astronomical Society"
DESCRIPTION = "Package for preparing papers in the journal 'Monthly Notices of \
the Royal Astronomical Society'."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn55729"

RPM_NAME = "texlive-mnras-2023.209.3.1svn55729-55.1.noarch.rpm"
RPM_HASH = "710e279cfb7cd2dd891c6449a1277331f70531bc093b7738e4c75719ee6a7c178361a01d00265c07878ca08c799584fae47ace824d1ed0a1dbe77da593b92292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mnras.cls \
texlive-mnras"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-dcolumn.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-natbib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
