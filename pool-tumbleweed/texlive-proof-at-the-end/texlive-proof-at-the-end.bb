SUMMARY = "A package to move proofs to appendix"
DESCRIPTION = "This package aims to provide a way to easily move proofs to the \
appendix. You can (among other things) move proofs to different \
places/sections, create links from theorems to proofs, restate \
theorems, add comments in appendix..."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64188"

RPM_NAME = "texlive-proof-at-the-end-2023.209.svn64188-53.1.noarch.rpm"
RPM_HASH = "cf752ea43154c1664f8cf698e0cc028f90ca9fe16e5a1220a6cfe0da7bd9b18c3eec90cded57f0b259dde169572f622bd741678a2edd3172e71fd1f2849de6ad"
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
