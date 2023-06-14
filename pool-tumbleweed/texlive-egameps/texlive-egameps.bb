SUMMARY = "LaTeX package for typesetting extensive games"
DESCRIPTION = "The style is intended to have enough features to draw any \
extensive game with relative ease. The facilities of PSTricks \
are used for graphics. (An older version of the package, which \
uses the LaTeX picture environment rather than PSTricks and \
consequently has many fewer features is available on the \
package home page.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-egameps-2023.201.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "f6a194f97f8e582c6255120de529e6fec56b464175f03f16a1c7b4b61bbe5882c5c91c0bf0d4b8567165f5365af42e24719ce73c359629797bcb5fc1db270225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-egameps.sty \
texlive-egameps"

RDEPENDS:${PN} += "/bin/sh \
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
