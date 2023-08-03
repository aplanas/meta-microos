SUMMARY = "Classes for University of Manchester Dept of Computer Science"
DESCRIPTION = "The bundle provides thesis and project report document classes \
from the University of Manchester's Department of Computer \
Science."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn23861"

RPM_NAME = "texlive-muthesis-2023.209.svn23861-55.1.noarch.rpm"
RPM_HASH = "85ecb5f7e627d35c0388b14d0209fc6bb052d4a868fddb8d30d90e73a8d0959c67718fefb38913c0b84e86670c980624e7c3822a450670ef1baf6ae5cba25a26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-muthesis.cls \
tex-third-rep.cls \
texlive-muthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-report.cls \
tex-setspace.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
