SUMMARY = "Draw ellipses and elliptical arcs using the standard LaTeX2e picture environment"
DESCRIPTION = "Draw ellipses and elliptical arcs using the standard LaTeX2e \
picture environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39025"

RPM_NAME = "texlive-ellipse-2023.201.1.0svn39025-53.2.noarch.rpm"
RPM_HASH = "135586bcc14177a02162b53965f39cc218f08c631df644da2cdd04eee8d725cf4faa919daf8fd5f88b4c3d4c2ba9f4cf4092bcb52f33ff15adfb52b01d760a6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ellipse.sty \
texlive-ellipse"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
