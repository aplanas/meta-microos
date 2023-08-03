SUMMARY = "Fallback CJK font support for xeCJK"
DESCRIPTION = "The zxjafbfont package"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn28539"

RPM_NAME = "texlive-zxjafbfont-2023.209.0.0.2svn28539-53.1.noarch.rpm"
RPM_HASH = "ac0d2f3766fbc2ff29df05c7aca7fa31e097fef58a3a7fcdcd47e04272568d63e5fdd173d8cfd715d29d2e03eb291e765418a73673e0b18fe534c72d6da18437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zxjafbfont.sty \
texlive-zxjafbfont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xeCJK.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
