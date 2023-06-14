SUMMARY = "Package for underlining"
DESCRIPTION = "The package provides an \\ul (underline) command which will \
break over line ends; this technique may be used to replace \\em \
(both in that form and as the \\emph command), so as to make \
output look as if it comes from a typewriter. The package also \
offers double and wavy underlining, and striking out (line \
through words) and crossing out (/// over words). The package \
works with both Plain TeX and LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn53365"

RPM_NAME = "texlive-ulem-2023.201.svn53365-53.1.noarch.rpm"
RPM_HASH = "ea058571830084cd3da5638fdf3fa37c7f9be28d3c7165ebbeb83f38c686b6a9cd2aec61ca20876f53c50ec84c1e214c58bc709271687f0cbf5171a83af5dc2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ulem.sty \
texlive-ulem"

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
