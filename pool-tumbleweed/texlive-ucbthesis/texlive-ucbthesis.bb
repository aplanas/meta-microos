SUMMARY = "Thesis and dissertation class supporting UCB requirements"
DESCRIPTION = "The class provides the necessary framework for electronic \
submission of Masters theses and Ph.D. dissertations at the \
University of California, Berkeley. It is based on the memoir \
class."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.6svn51690"

RPM_NAME = "texlive-ucbthesis-2023.209.3.6svn51690-53.1.noarch.rpm"
RPM_HASH = "4326269293b3b2911569db89997e5aef1e11a874eb37bd8e6e04e8cf6184f50cb057b4dc25a327ee396bcb5820edb513c273ae4ca3d3479fca9be863e40a4c9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ucbthesis.cls \
texlive-ucbthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-memoir.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
