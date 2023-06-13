SUMMARY = "Draw ellipses and elliptical arcs using the standard LaTeX2e picture environment"
DESCRIPTION = "Draw ellipses and elliptical arcs using the standard LaTeX2e \
picture environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39025"

RPM_NAME = "texlive-ellipse-2023.201.1.0svn39025-53.1.noarch.rpm"
RPM_HASH = "366bd0d2ab6b63a71d41003a6ac68b4dcd025fa5a073ac04b27173e1f267f8226916e7eeec8924e6ebc98140460739cdfd487913f51ade7c75b12520b236911c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ellipse.sty) \
texlive-ellipse"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pict2e.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
