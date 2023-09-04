SUMMARY = "Style for Reports by US Army Corps of Engineers"
DESCRIPTION = "A class for typesetting Technical Information Reports of the \
Engineer Research and Development Center, US Army Corps of \
Engineers. The class was commissioned and paid for by US Army \
Corps of Engineers, Engineer Research and Development Center, \
3909 Halls Ferry Road, Vicksburg, MS 39180-6199."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-erdc-2023.209.1.1svn15878-54.2.noarch.rpm"
RPM_HASH = "27f491afb7aa3147d47c51bcec32b5ed1290570b6b4decec84f95eac18813ccfae1d594e9713382a3aa346e14ca473fcba0407e30501ee9493bb6db7ba77d51e"
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
