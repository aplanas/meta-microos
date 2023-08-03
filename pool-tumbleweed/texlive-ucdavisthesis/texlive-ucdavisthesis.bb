SUMMARY = "A thesis/dissertation class for University of California at Davis"
DESCRIPTION = "The ucdavisthesis class is a LaTeX class that allows you to \
create a dissertation or thesis conforming to UC Davis \
formatting requirements as of April 2016."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn40772"

RPM_NAME = "texlive-ucdavisthesis-2023.209.1.3svn40772-53.1.noarch.rpm"
RPM_HASH = "e658fce984eb94d467b185567650d2f1a45c188daa825a8b6aa123d3d27744603cfe367de902a5cce8c625fe8a9b2031c388fcb962986f156fca00f6c581649e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ucdavisthesis.cls \
tex-ucdthesis10.clo \
tex-ucdthesis11.clo \
tex-ucdthesis12.clo \
tex-ucdthesis13.clo \
texlive-ucdavisthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
