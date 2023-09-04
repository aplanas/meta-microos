SUMMARY = "Decorative chapter headings"
DESCRIPTION = "A package for creating decorative chapter headings with \
quotations. Uses graphical and coloured output and by default \
needs the 'Adobe standard font set' (as supported by psnfss)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn56926"

RPM_NAME = "texlive-quotchap-2023.209.1.3svn56926-54.2.noarch.rpm"
RPM_HASH = "5703f0e14eac80b0f7671ea3d8dc976f6887c0b0080542a1a22880e3b894dd0d173b49ae4e7afdb10af04968548dd0d21d30eea85cdd1552c3ce78bf86ae992d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quotchap.sty \
texlive-quotchap"

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
