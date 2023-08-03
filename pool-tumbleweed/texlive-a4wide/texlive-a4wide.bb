SUMMARY = "'Wide' a4 layout"
DESCRIPTION = "This package increases the width of the typeset area of an a4 \
page. This sort of operation is capable of producing \
typographically poor results; the operation itself is better \
provided by the geometry package. The package uses the a4 \
package."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20943"

RPM_NAME = "texlive-a4wide-2023.209.svn20943-55.1.noarch.rpm"
RPM_HASH = "6e799272b21426a0e82d98a390c4ec5b05a69edc18312ba8a8869ea95a62db0bfad60f41773139668db45bf497f1331087cf8ae90ea851218ea03ed6d8372621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-a4wide.sty \
texlive-a4wide"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-a4.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
