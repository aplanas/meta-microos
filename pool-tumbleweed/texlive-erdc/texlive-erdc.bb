SUMMARY = "Style for Reports by US Army Corps of Engineers"
DESCRIPTION = "A class for typesetting Technical Information Reports of the \
Engineer Research and Development Center, US Army Corps of \
Engineers. The class was commissioned and paid for by US Army \
Corps of Engineers, Engineer Research and Development Center, \
3909 Halls Ferry Road, Vicksburg, MS 39180-6199."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-erdc-2023.209.1.1svn15878-54.1.noarch.rpm"
RPM_HASH = "03ed7b1977f4d191099197517c3ed6e7d7cdb4cee509641e4d88a6128f2f5e9381f61e1a33ef3c64bfb6b083487aab6e5f1e879f78da59fa39447f6b391ef33d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-erdc.cls \
texlive-erdc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-caption.sty \
tex-color.sty \
tex-courier.sty \
tex-dcolumn.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-longtable.sty \
tex-natbib.sty \
tex-ragged2e.sty \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
