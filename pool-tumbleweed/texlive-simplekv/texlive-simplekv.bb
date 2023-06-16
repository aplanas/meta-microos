SUMMARY = "A simple key/value system for TeX and LaTeX"
DESCRIPTION = "The package provides a simple key/value system for TeX and \
LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2asvn64578"

RPM_NAME = "texlive-simplekv-2023.201.0.0.2asvn64578-53.1.noarch.rpm"
RPM_HASH = "35def20ff985aec58079035b1fc86ccc49500b51c0137b2453d40a975b1199094a42ed2a24fd9eea9b71c74aca9d8fd7565ac01121a5522cddb339afa8c28567"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simplekv.sty \
tex-simplekv.tex \
texlive-simplekv"

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
