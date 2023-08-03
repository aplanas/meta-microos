SUMMARY = "BibLaTeX implementation of the unified stylesheet for linguistics journals"
DESCRIPTION = "BibLaTeX-unified is an opinionated BibLaTeX implementation of \
the Unified Stylesheet for Linguistics Journals"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.20svn64975"

RPM_NAME = "texlive-biblatex-unified-2023.209.1.20svn64975-54.1.noarch.rpm"
RPM_HASH = "3572e43ba23162f9bb3ac3502158260c04a50159e5a64c52904c53bf53f4ca9a7f3c3afdc16dd0f45e4503b027b8d3fa3fcbbd5e951211610431a45d4e868a4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unified.bbx \
tex-unified.cbx \
texlive-biblatex-unified"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear-comp.cbx \
tex-authoryear.bbx \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
