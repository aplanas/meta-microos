SUMMARY = "The 'real' way to transpose a Matrix"
DESCRIPTION = "With realtranspose you can notate the transposition of a matrix \
by rotating the symbols 90 degrees. This is a hommage to the \
realhats package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56623"

RPM_NAME = "texlive-realtranspose-2023.201.1.1svn56623-53.1.noarch.rpm"
RPM_HASH = "fa6056f48ae6bbc65f8b99243a40b501853ae09eaa6aa6c93c27cbefb23d83ce8020935823d56cc1d31bbc5c6168c734a8918249d48d2d5325471ca94dbb9c18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-realtranspose.sty \
texlive-realtranspose"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
