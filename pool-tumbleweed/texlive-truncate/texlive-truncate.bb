SUMMARY = "Truncate text to a specified width"
DESCRIPTION = "The package will by default break at word boundaries, but \
package options are offered to permit breaks within words."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.3.6svn18921"

RPM_NAME = "texlive-truncate-2023.209.3.6svn18921-53.1.noarch.rpm"
RPM_HASH = "211e487fc9562caa62e582552c1943e4edf21e837778ef5347c01825e58765813fdc69b06369ec7d6b520f5d4f14b2c2cf12202caa1496367c515d072f6bab45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-truncate.sty \
texlive-truncate"

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
