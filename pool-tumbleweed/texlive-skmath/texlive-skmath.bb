SUMMARY = "Extensions to the maths command repertoir"
DESCRIPTION = "The package provides a selection of new maths commands and \
improved re-definitions of existing commands."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5asvn52411"

RPM_NAME = "texlive-skmath-2023.209.0.0.5asvn52411-58.1.noarch.rpm"
RPM_HASH = "48044c2c37f93a58b095cb8ac5dcb947c26539de0367a52f43bdc48b2afad7c30d6f3d4dbd9f2af7b5aa692985f52474d34b36fb9488a3fd726d5c3168d395b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skmath.sty \
texlive-skmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-expl3.sty \
tex-isomath.sty \
tex-l3keys2e.sty \
tex-mathtools.sty \
tex-xfrac.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
