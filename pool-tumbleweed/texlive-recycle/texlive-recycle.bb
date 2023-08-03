SUMMARY = "A font providing the 'recyclable' logo"
DESCRIPTION = "This single-character font is provided as Metafont source, and \
in Adobe Type 1 format. It is accompanied by a trivial LaTeX \
package to use the logo at various sizes."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-recycle-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "0815288d4a6fa03d99c70069c68c8af1012813cd57775f5e30fff2229c07a97424063b73fc17ad30f6127d528817403dc4d990fa522600e4ece7e4a3bbd943d2"
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
