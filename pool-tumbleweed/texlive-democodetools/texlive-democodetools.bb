SUMMARY = "Package for LaTeX code documentation"
DESCRIPTION = "This is 'yet another doc/docx/doc3' package for LaTeX code \
documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1betasvn64314"

RPM_NAME = "texlive-democodetools-2023.209.1.0.1betasvn64314-53.1.noarch.rpm"
RPM_HASH = "0c7227e51d198f4b71313dd3856f639ea480dca09e9fb2da3477f87ce5a45b40f2e7a191717f5672f699546fb82764f59477b164c05151e87ff337ede1b85174"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-democodelisting.sty \
tex-democodetools.sty \
texlive-democodetools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-scontents.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
