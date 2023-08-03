SUMMARY = "Arrows for use in chemistry"
DESCRIPTION = "This bundle consists of a font (available as Metafont source, \
MetaPost source, and generated type 1 versions), and a package \
to use it. The arrows in the font are designed to look more \
like those in chemistry text-books than do Knuth's originals."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.9svn17146"

RPM_NAME = "texlive-chemarrow-2023.209.0.0.9svn17146-54.1.noarch.rpm"
RPM_HASH = "0c6194617883e9c87aac2ba3a7d896fdb94db3a78c5658dfa14de952343f449cbe039fd3a438e582340f5e08543ab9cb686977b70dbd5bbcdcd45a4b87d2aaa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arrow.tfm \
tex-chemarrow.map \
tex-chemarrow.sty \
texlive-chemarrow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-chemarrow-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
