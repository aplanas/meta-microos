SUMMARY = "Typesetting menu cards with LaTeX"
DESCRIPTION = "This LaTeX package can be used for typesetting simple \
restaurant menus."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn55643"

RPM_NAME = "texlive-menucard-2023.209.0.0.1svn55643-55.1.noarch.rpm"
RPM_HASH = "7c967628e1087665b5655e4be8dd4d95421c9fc48beb491c4df9ec510ac4b4bd1989169f5e878a0bf15f7b06f3fa19848afdb62fef8d4d019055789744048f54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-menucard.sty \
texlive-menucard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-soul.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
