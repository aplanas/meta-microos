SUMMARY = "A variable-width minipage"
DESCRIPTION = "The varwidth environment is superficially similar to minipage, \
but the specified width is just a maximum value -- the box may \
get a narrower 'natural' width."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.92svn24104"

RPM_NAME = "texlive-varwidth-2023.209.0.0.92svn24104-54.1.noarch.rpm"
RPM_HASH = "ba41771d272a49492dd694d268bfc8ec887368943307b6d0f11dde968e40c929732cf6fadb9c9f8cad565bda75904cc7d4ca2b2eb97f284ebd5e7e928dd046cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-varwidth.sty \
texlive-varwidth"

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
