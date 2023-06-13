SUMMARY = "Copenhagen University or faculty logo for front page"
DESCRIPTION = "A comprehensive package for adding University of Copenhagen or \
faculty logo to your front page. For use by student or staff at \
University of Copenhagen (Kobenhavns Universitet)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn45935"

RPM_NAME = "texlive-ku-template-2023.201.0.0.02svn45935-55.1.noarch.rpm"
RPM_HASH = "e249c1c87736a4c044921134172693e983c84df78ceec181c179c9813c18e9980e384917ca3f8fa900317a9444626bb3499550068d0bd8c23729d7897ed842b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ku-template.sty) \
texlive-ku-template"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(titling.sty) \
tex(wallpaper.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
