SUMMARY = "Extending \\hrulefill"
DESCRIPTION = "The package provides extended macros for the default \\hrulefill \
command. It allows modification of the width and the colour of \
the line."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn22575"

RPM_NAME = "texlive-xhfill-2023.209.1.01svn22575-53.1.noarch.rpm"
RPM_HASH = "ba6387fe9bef86980993421a944dc74fe778867b0c499342bd4277758251851eb1ac6a3d06a9574e558f2e070368d797bbbe1d7e0a64a9fe7091242448a1eeb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xhfill.sty \
texlive-xhfill"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
