SUMMARY = "The title font of the Mads Fok magazine"
DESCRIPTION = "The bundle provides an Adobe Type 1 font, and LaTeX support for \
its use. The magazine web site shows the font in use in a few \
places."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-foekfont-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "6b381103e034678f3253971913dbf04363598244ce1be4cd726070630fe72bb2c96528a71e1ac83c31e7600b281570bc697027aba2f767d3c85269f14df4de5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-foekfont.map \
tex-foekfont.sty \
tex-foekfont.tfm \
tex-ot1foekfont.fd \
tex-t1foekfont.fd \
texlive-foekfont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-foekfont-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
