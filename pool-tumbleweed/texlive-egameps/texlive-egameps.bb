SUMMARY = "LaTeX package for typesetting extensive games"
DESCRIPTION = "The style is intended to have enough features to draw any \
extensive game with relative ease. The facilities of PSTricks \
are used for graphics. (An older version of the package, which \
uses the LaTeX picture environment rather than PSTricks and \
consequently has many fewer features is available on the \
package home page.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-egameps-2023.209.1.1svn15878-54.1.noarch.rpm"
RPM_HASH = "40d81263a3a5c8b2f0a63b362b3dea37cc9baac097a0b8d49d72ec5d028098bc5c368d936ac2973167b578679c17caf79a768f2f894386cc2cbb2b6c5be7f654"
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
