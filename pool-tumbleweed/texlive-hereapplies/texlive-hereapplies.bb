SUMMARY = "A LaTeX package for referencing groups of pages that share something in common"
DESCRIPTION = "Here Applies is a LaTeX package that allows to collect groups \
of labels and reference them altogether. It can be used for \
creating informal glossaries that cross-link concepts to their \
applications, or simply mentioning multiple pages that share \
something in common."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0.1svn65251"

RPM_NAME = "texlive-hereapplies-2023.201.1.0.1svn65251-53.2.noarch.rpm"
RPM_HASH = "9ab08ee0c355d7ea81a3d98590a356c03c2dab591a6ad7b03d4ee0f10f2d2cf3f275f766a5ae002d7e234b951f87cd0cc9007c5ea5f3a82b1b6b277928263c3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hereapplies.sty \
texlive-hereapplies"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-refcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
