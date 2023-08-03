SUMMARY = "Decorative chapter headings"
DESCRIPTION = "A package for creating decorative chapter headings with \
quotations. Uses graphical and coloured output and by default \
needs the 'Adobe standard font set' (as supported by psnfss)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn56926"

RPM_NAME = "texlive-quotchap-2023.209.1.3svn56926-54.1.noarch.rpm"
RPM_HASH = "d17cab37db763a5f1a9d36b42570165207198470da93b0dfd1b694f7146af8155b6383d57a2b4915f1c1d6ccfa018a64426509fcb906df805409952d3ce69fc9"
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
