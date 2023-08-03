SUMMARY = "The 'real' way to transpose a Matrix"
DESCRIPTION = "With realtranspose you can notate the transposition of a matrix \
by rotating the symbols 90 degrees. This is a hommage to the \
realhats package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56623"

RPM_NAME = "texlive-realtranspose-2023.209.1.1svn56623-54.1.noarch.rpm"
RPM_HASH = "a5235a16c3065d810b2becbe3b99edad11847ac54fb7f49d3b3c5ba8745d30d2f44df65be1f8231e6fcaa0454156ad04fbb24d138935b2e871c5bc44aafea70a"
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
