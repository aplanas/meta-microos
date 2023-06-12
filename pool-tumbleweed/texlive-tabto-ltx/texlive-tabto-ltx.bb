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

PV = "2023.201.1.4svn54080"

RPM_NAME = "texlive-tabto-ltx-2023.201.1.4svn54080-54.1.noarch.rpm"
RPM_HASH = "c95fc21ba4fced37674279d992cffb19b3bb3b4fdd4786407e563785ca5a5a5e827cbbc02e94f0bf7f53aa13b004f5667a13e1a3bd1b72122815b1b48bba533a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tabto.sty) \
texlive-tabto-ltx"
RDEPENDS:${PN} += "/bin/sh \
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
