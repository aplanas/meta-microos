SUMMARY = "LaTeX package for typesetting extensive games"
DESCRIPTION = "The style is intended to have enough features to draw any \
extensive game with relative ease. The facilities of PSTricks \
are used for graphics. (An older version of the package, which \
uses the LaTeX picture environment rather than PSTricks and \
consequently has many fewer features is available on the \
package home page.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-egameps-2023.209.1.1svn15878-54.2.noarch.rpm"
RPM_HASH = "4a0ad580c90246b71c9e46b55d776b2145f2148114398f62e12641e3e05faa1755606f7e4157dab4aaf9069cb9efe4abf898500ec96335ec49c4ab473de8cbb1"
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
