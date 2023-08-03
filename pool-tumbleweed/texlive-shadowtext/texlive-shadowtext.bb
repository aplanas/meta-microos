SUMMARY = "Produce text with a shadow behind it"
DESCRIPTION = "The package introduces a command \\shadowtext, which adds a drop \
shadow to the text that is given as its argument. The colour \
and positioning of the shadow are customisable."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn26522"

RPM_NAME = "texlive-shadowtext-2023.209.0.0.3svn26522-54.1.noarch.rpm"
RPM_HASH = "164be85c1a9715ba2b85a22b501d6b35f4a1e702d786132ebdbc51ba2f00813f626b7b88c098803e1228cc4ec87c75346043ab7c47aa87203eeb3150da0712dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-shadowtext.sty \
texlive-shadowtext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
