SUMMARY = "Draw framed boxes with standard CSS attributes that can break over multiple pages"
DESCRIPTION = "The longfbox package provides framed boxes that can be \
customized using standard CSS attributes. It was written to \
support precise rendering of Madoko documents in LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn39028"

RPM_NAME = "texlive-longfbox-2023.209.1.0svn39028-55.1.noarch.rpm"
RPM_HASH = "d8239765bc8b07467d5e4cf70b3effeda0097b114ab458c72135b94f1600f39f40e0114d984f870cc1cbbf115526d8a94b90391992eaea255aa4ad8f8e560e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-longbox.sty \
tex-longfbox.sty \
texlive-longfbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ellipse.sty \
tex-footnote.sty \
tex-options.sty \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
