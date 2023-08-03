SUMMARY = "Draw cartesian coordinate systems"
DESCRIPTION = "The package provides commands for typesetting number lines \
(coordinate axes), coordinate systems and grids in the picture \
environment. The package may be integrated with other drawing \
mechanisms: the documentation shows examples of drawing graphs \
(coordinate tables created by Maple), using the eepic package's \
drawing capabilities."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn15878"

RPM_NAME = "texlive-coordsys-2023.209.1.4svn15878-55.1.noarch.rpm"
RPM_HASH = "427ebb265a0558eac6992bb4756eef0324b7741bc635cd773839bbe9f23e885c308510fa62d45f491914836ddb48e8ec8d8315b47a1d00cfc6979b1edf72d92d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coordsys.sty \
tex-logsys.sty \
texlive-coordsys"

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
