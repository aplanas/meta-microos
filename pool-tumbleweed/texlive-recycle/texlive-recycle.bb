SUMMARY = "A font providing the 'recyclable' logo"
DESCRIPTION = "This single-character font is provided as Metafont source, and \
in Adobe Type 1 format. It is accompanied by a trivial LaTeX \
package to use the logo at various sizes."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-recycle-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "9217c628fc3c6af3fd347bf2df7feef81473511713071fe52e83526069c3394956997068a759945c815f813d9a3222b0ea51e1e422a3b5442c60f3d3998c878e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-recycle.map \
tex-recycle.sty \
tex-recycle.tfm \
texlive-recycle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-recycle-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
