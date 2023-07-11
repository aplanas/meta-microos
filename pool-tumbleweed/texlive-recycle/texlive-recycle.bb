SUMMARY = "A font providing the 'recyclable' logo"
DESCRIPTION = "This single-character font is provided as Metafont source, and \
in Adobe Type 1 format. It is accompanied by a trivial LaTeX \
package to use the logo at various sizes."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-recycle-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "9d1191ea1eb5054900e5a45fad91fbc7f51de9efe9aba7cdd6a3d3e4d9611eb27f5bb7874600febdaca8ee1912e4802643484bbbb5603b7ed75d3fb167010c27"
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
