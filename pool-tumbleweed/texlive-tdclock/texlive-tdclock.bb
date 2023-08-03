SUMMARY = "A ticking digital clock package for PDF output"
DESCRIPTION = "A ticking digital clock package to be used in Pdf-LaTeX \
documents, for example in presentations."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.5svn33043"

RPM_NAME = "texlive-tdclock-2023.209.2.5svn33043-55.1.noarch.rpm"
RPM_HASH = "651a716fb491d5e297db2dc7b7dc51d5951a47d21cca5dc95e2eefd41694b09da1522a620306812d6fab356150364d94c64a6b8f42c504069960b939420a4135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tdclock.sty \
texlive-tdclock"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
