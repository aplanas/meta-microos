SUMMARY = "Generate random mazes"
DESCRIPTION = "This package can generate random square mazes of a specified \
size. The mazes generated by this package are natural and their \
solution is not too obvious. The output it based on the picture \
environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn65508"

RPM_NAME = "texlive-maze-2023.201.1.2svn65508-52.1.noarch.rpm"
RPM_HASH = "13038a79a0e84491ba58ecc875f7d300bfb9dc4012036c636d5c38f5245d1742693fcac221fa2346b890c1ea110e1052ca2ad9d68376bc84130aa04e3cb3ab32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-maze.sty \
texlive-maze"

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
