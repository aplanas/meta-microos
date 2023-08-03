SUMMARY = "'Tab' to a measured position in the line"
DESCRIPTION = "\\tabto{<length>} moves the typesetting position to <length> \
from the left margin of the paragraph. If the typesetting \
position is already further along, \\tabto starts a new line; \
the command \\tabto* will move position backwards if necessary, \
so that previous text may be overwritten. The command \
\\TabPositions may be used to define a set of tabbing positions, \
after which the command \\tab advances typesetting position to \
the next defined 'tab stop'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn54080"

RPM_NAME = "texlive-tabto-ltx-2023.209.1.4svn54080-55.1.noarch.rpm"
RPM_HASH = "94ecd2d8dd6e0de973b025ce5854c39a472288610a17d52ec4d6fc117c57a461d5dbaa3617b1e77962603e4dbf2a7745b4e6c28c7b008bf0909855d1ee057b43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabto.sty \
texlive-tabto-ltx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
