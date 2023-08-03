SUMMARY = "Automated patches for pLaTeX/upLaTeX"
DESCRIPTION = "Japanese pLaTeX/upLaTeX formats and packages often conflict \
with other LaTeX packages which are unaware of pLaTeX/upLaTeX. \
In the worst case, such packages throw a fatal error or end up \
with a wrong output. The goal of this package is that there \
should be no need to worry about such incompatibilities, \
because specific patches are loaded automatically whenever \
necessary. This helps not only to simplify source files, but \
also to make the appearance of working pLaTeX/upLaTeX sources \
similar to those of ordinary LaTeX ones."
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.9qsvn64072"

RPM_NAME = "texlive-plautopatch-2023.209.0.0.9qsvn64072-53.1.noarch.rpm"
RPM_HASH = "b591899122aa17deea8253c9d66466fd0fc54f3f4ccfeb3fd10a96f203ade1ef9536a3b9517125b1ca73fce44160a54e5ceb5a67afde0d0956e3593255c88739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plarydshln.sty \
tex-plautopatch.sty \
tex-plcollcell.sty \
tex-plextarydshln.sty \
tex-plsiunitx.sty \
tex-pxpgfrcs.sty \
tex-pxstfloats.sty \
texlive-plautopatch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-arydshln.sty \
tex-collcell.sty \
tex-colortbl.sty \
tex-delarray.sty \
tex-filehook.sty \
tex-pgfrcs.sty \
tex-plarray.sty \
tex-plext.sty \
tex-plextarray.sty \
tex-plextcolortbl.sty \
tex-plextdelarray.sty \
tex-pxeveryshi.sty \
tex-siunitx.sty \
tex-stfloats.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
