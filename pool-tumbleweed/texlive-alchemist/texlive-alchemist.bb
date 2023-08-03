SUMMARY = "Typeset alchemist and astrological symbols"
DESCRIPTION = "This style file makes the alchemical and astrological symbols \
accessible in Unicode."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.00svn66548"

RPM_NAME = "texlive-alchemist-2023.209.1.00svn66548-55.1.noarch.rpm"
RPM_HASH = "198699c144845910e6c6f84728206095130314c4eab456cb47b44f56ff983fac998a89574d676e291f720b95702aeba67bc3e2d0b61d06b19bc8f7e87dda3fea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alchemist.sty \
texlive-alchemist"

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
