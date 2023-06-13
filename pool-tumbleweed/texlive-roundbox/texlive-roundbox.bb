SUMMARY = "Round boxes in LaTeX"
DESCRIPTION = "This package implements a command \\roundbox that can be used, \
in LaTeX, for producing boxes, framed with rounded corners."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn29675"

RPM_NAME = "texlive-roundbox-2023.201.0.0.2svn29675-53.1.noarch.rpm"
RPM_HASH = "38c5fdd29f242bc3a8755ddaa4d4249ab851f687f70d098a4970f7e6d15334c301832112bb82c2a156fc2fdee696eca0c1bd958e4c17b5cf78114a5293302b9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(roundbox.sty) \
texlive-roundbox"

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
