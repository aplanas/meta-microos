SUMMARY = "Style for Reports by US Army Corps of Engineers"
DESCRIPTION = "A class for typesetting Technical Information Reports of the \
Engineer Research and Development Center, US Army Corps of \
Engineers. The class was commissioned and paid for by US Army \
Corps of Engineers, Engineer Research and Development Center, \
3909 Halls Ferry Road, Vicksburg, MS 39180-6199."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-erdc-2023.201.1.1svn15878-53.2.noarch.rpm"
RPM_HASH = "b0a6811f465510fb8c2855862410cc3d5d74d5cfd617e9789b0c98f44df9328db32ecaa29e11af03313f84847353cbb35171d93c40e63e024af6a8832cb93e6f"
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
