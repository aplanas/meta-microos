SUMMARY = "The title font of the Mads Fok magazine"
DESCRIPTION = "The bundle provides an Adobe Type 1 font, and LaTeX support for \
its use. The magazine web site shows the font in use in a few \
places."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-foekfont-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "08e545295ae7d471640602024478d85f781b341625ae009e83a2dccb5d5709b0b5529fe942925c6c84123f95bcfb785c05b0b534c6dc12e66d586d2001f411b5"
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
