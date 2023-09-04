SUMMARY = "The 'real' way to transpose a Matrix"
DESCRIPTION = "With realtranspose you can notate the transposition of a matrix \
by rotating the symbols 90 degrees. This is a hommage to the \
realhats package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56623"

RPM_NAME = "texlive-realtranspose-2023.209.1.1svn56623-54.2.noarch.rpm"
RPM_HASH = "94f425cba31e0876c5a8df22c7a85a3b56299ef9756e37f0191f210ed06976e8a498acbe94f37300066e794f1174a162c1cf40272d9ad20fb46f97c9ba589caf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-realtranspose.sty \
texlive-realtranspose"

RDEPENDS:${PN} += "/usr/bin/sh \
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
