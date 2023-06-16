SUMMARY = "Variants on printing dimensions"
DESCRIPTION = "A package for LaTeX providing a number of commands for printing \
the value of a TeX dimension. For example, \
\\tenthpt{\\baselineskip} yields the current value of \
\\baselineskip rounded to the nearest tenth of a point."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn28918"

RPM_NAME = "texlive-showdim-2023.201.1.2svn28918-53.1.noarch.rpm"
RPM_HASH = "f06b3642b78a050ff1d3bb923895b020541ed5117853a4db3a880a36d5f106a53e9e9754b7936f05a8aea32e31a94f86deeda49bda078e07dd168746c0dcb22e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-showdim.sty \
texlive-showdim"

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
