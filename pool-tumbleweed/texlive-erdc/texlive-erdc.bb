SUMMARY = "Style for Reports by US Army Corps of Engineers"
DESCRIPTION = "A class for typesetting Technical Information Reports of the \
Engineer Research and Development Center, US Army Corps of \
Engineers. The class was commissioned and paid for by US Army \
Corps of Engineers, Engineer Research and Development Center, \
3909 Halls Ferry Road, Vicksburg, MS 39180-6199."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-erdc-2023.201.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "c08620f96213c2e1a565f924d5541f952f86fb4851950599b4e67796fa278ceb4ed71b36fa004f269b97ede5ef4d4ccd108753a0bd2a1251880fec9b63c60997"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-erdc.cls \
texlive-erdc"

RDEPENDS:${PN} += "/bin/sh \
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
