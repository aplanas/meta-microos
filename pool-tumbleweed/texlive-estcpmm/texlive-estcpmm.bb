SUMMARY = "Style for Munitions Management Project Reports"
DESCRIPTION = "Provides a class which supports typesetting Cost and \
Performance Reports and Final Reports for Munitions Management \
Reports, US Environmental Security Technology Certification \
Program. The class was commissioned and paid for by US Army \
Corps of Engineers, Engineer Research and Development Center, \
3909 Halls Ferry Road, Vicksburg, MS 39180-6199."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn17335"

RPM_NAME = "texlive-estcpmm-2023.209.0.0.4svn17335-53.1.noarch.rpm"
RPM_HASH = "5d7a843fba956c3be4793b01a3122c1b286a12e095033e5ad52ee61f504dec98e5bf6ef9629357131089d3e5e302c10081116aa602700a71b5770740056475e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-estcpmm.cls \
texlive-estcpmm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-caption.sty \
tex-courier.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-mathptmx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
