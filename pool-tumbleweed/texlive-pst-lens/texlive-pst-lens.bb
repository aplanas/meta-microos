SUMMARY = "Lenses with PSTricks"
DESCRIPTION = "This PSTricks package provides a really rather simple command \
\\PstLens that will draw a lens. Command parameters provide a \
remarkable range of effects."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn15878"

RPM_NAME = "texlive-pst-lens-2023.201.1.02svn15878-52.1.noarch.rpm"
RPM_HASH = "a5dcb8e9dc00d7094fa6d554735b8c7a0893c22331feb0f10ff808d5474c2591306bcdc37778a78d306ec951c503b825ce69da4e8d89e4919e395975890b859e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-lens.sty \
tex-pst-lens.tex \
texlive-pst-lens"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
