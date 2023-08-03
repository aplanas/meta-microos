SUMMARY = "Experimental package to extract and reinsert PDF annotations"
DESCRIPTION = "The package is based on the pax package from Heiko Oberdiek. It \
offers a lua-based alternative to the java based pax.jar to \
extract the annotations from a PDF. The resulting file can then \
be used together with pax.sty. It also offers an extended style \
which works with all three major engines."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.53svn64415"

RPM_NAME = "texlive-newpax-2023.209.0.0.53svn64415-55.1.noarch.rpm"
RPM_HASH = "09c34b8f3944d5165577f10453c14afc0a5d538e0ae373bd7e0dee9c87b652764c620f70d2e3d4e2884ad11d97152b40c10ffb646ec4cd52de6f988ffa21e2ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newpax.sty \
texlive-newpax"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-auxhook.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-ltxcmds.sty \
tex-pdfmanagement-testphase.sty \
tex-xfp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
