SUMMARY = "Experimental package to extract and reinsert PDF annotations"
DESCRIPTION = "The package is based on the pax package from Heiko Oberdiek. It \
offers a lua-based alternative to the java based pax.jar to \
extract the annotations from a PDF. The resulting file can then \
be used together with pax.sty. It also offers an extended style \
which works with all three major engines."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.53svn64415"

RPM_NAME = "texlive-newpax-2023.201.0.0.53svn64415-54.1.noarch.rpm"
RPM_HASH = "76ef80393c30739d2c1c4851b606eccc2a904e5fad4db5b8ac27f771ce9ce6468d3e9cd281ccb11953ec87e272a4760f0f0920f2f85dad82175b4501ceadcce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newpax.sty \
texlive-newpax"

RDEPENDS:${PN} += "/bin/sh \
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
