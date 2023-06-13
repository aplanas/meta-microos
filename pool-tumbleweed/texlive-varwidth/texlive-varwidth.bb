SUMMARY = "A variable-width minipage"
DESCRIPTION = "The varwidth environment is superficially similar to minipage, \
but the specified width is just a maximum value -- the box may \
get a narrower 'natural' width."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.92svn24104"

RPM_NAME = "texlive-varwidth-2023.201.0.0.92svn24104-53.1.noarch.rpm"
RPM_HASH = "3d5faab969c0bacc99a7c9bd83a3df68fea0c4228cea1cf9572bdb8f34c733e7a6cd5eef64f313788c17a6da464fdaaeaca439cd8690b7d05fd9c396ed502029"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(varwidth.sty) \
texlive-varwidth"

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
