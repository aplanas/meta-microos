SUMMARY = "Package for underlining"
DESCRIPTION = "The package provides an \\ul (underline) command which will \
break over line ends; this technique may be used to replace \\em \
(both in that form and as the \\emph command), so as to make \
output look as if it comes from a typewriter. The package also \
offers double and wavy underlining, and striking out (line \
through words) and crossing out (/// over words). The package \
works with both Plain TeX and LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53365"

RPM_NAME = "texlive-ulem-2023.209.svn53365-54.1.noarch.rpm"
RPM_HASH = "02d159e6bc53780c2c5201c9e77bbc53a1fe9ba0f093e1139826c993b8e60065473ff9c3a3d1c157aa5b27c6648ddb891130b4539a149b44055710a950c0da17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ulem.sty \
texlive-ulem"

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
