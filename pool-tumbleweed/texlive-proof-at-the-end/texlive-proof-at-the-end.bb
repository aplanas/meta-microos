SUMMARY = "A package to move proofs to appendix"
DESCRIPTION = "This package aims to provide a way to easily move proofs to the \
appendix. You can (among other things) move proofs to different \
places/sections, create links from theorems to proofs, restate \
theorems, add comments in appendix..."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64188"

RPM_NAME = "texlive-proof-at-the-end-2023.201.svn64188-52.1.noarch.rpm"
RPM_HASH = "c013a26a3e4186fed98fb33054011203453480ea06bc9d6f715b6b05c8b2f5308d17527fe5ab12a19630d2661e09e2c1e8223748844db1a636f716345fbbdfde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-proof-at-the-end.sty \
texlive-proof-at-the-end"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-pgfkeys.sty \
tex-thm-restate.sty \
tex-thmtools.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
