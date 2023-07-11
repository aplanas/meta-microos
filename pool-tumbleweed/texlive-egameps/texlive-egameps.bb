SUMMARY = "LaTeX package for typesetting extensive games"
DESCRIPTION = "The style is intended to have enough features to draw any \
extensive game with relative ease. The facilities of PSTricks \
are used for graphics. (An older version of the package, which \
uses the LaTeX picture environment rather than PSTricks and \
consequently has many fewer features is available on the \
package home page.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-egameps-2023.201.1.1svn15878-53.2.noarch.rpm"
RPM_HASH = "0ea948f107ff1e0001850c0dd241bb89041a47564675a71a136ed6a3154f2119e3732670b2fca99b0fe3e09b8d14b794d2bbe1e4a4f7482fd6561a4feeb2a055"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-egameps.sty \
texlive-egameps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
