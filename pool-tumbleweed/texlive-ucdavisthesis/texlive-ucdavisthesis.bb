SUMMARY = "A thesis/dissertation class for University of California at Davis"
DESCRIPTION = "The ucdavisthesis class is a LaTeX class that allows you to \
create a dissertation or thesis conforming to UC Davis \
formatting requirements as of April 2016."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn40772"

RPM_NAME = "texlive-ucdavisthesis-2023.201.1.3svn40772-52.1.noarch.rpm"
RPM_HASH = "3133841b49ee7024bc010f096ef53b06f937307003418d3961bd494bc1f41dbf660de7eb2780e24f12aab470c822b6f6e96d0177c4891425b8fd1b1f336180d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ucdavisthesis.cls) \
tex(ucdthesis10.clo) \
tex(ucdthesis11.clo) \
tex(ucdthesis12.clo) \
tex(ucdthesis13.clo) \
texlive-ucdavisthesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
