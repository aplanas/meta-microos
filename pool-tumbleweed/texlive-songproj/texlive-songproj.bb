SUMMARY = "Generate Beamer slideshows with song lyrics"
DESCRIPTION = "This package, together with the Beamer class, is used to \
generate slideshows with song lyrics. This is typically used in \
religious services in churches equipped with a projector, for \
which this package has been written, but it can be useful for \
any type of singing assembly. It provides environments to \
describe a song in a natural way, and formatting it into slides \
with overlays. The package comes with an additional Python \
script that can be used to convert plain-text song lyrics to \
the expected LaTeX markup."
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.0.1svn64966"

RPM_NAME = "texlive-songproj-2023.209.1.0.1svn64966-58.1.noarch.rpm"
RPM_HASH = "91f0e4c855f2f1ef9dd43d4017cae773862a6d33312ab669dc1b5fa3699fa0ea6fe446a5f7027eaa63827f355fc820b97e67aa8ccb7c222256a72ca1fdafb877"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-songproj.sty \
texlive-songproj"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-verse.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
