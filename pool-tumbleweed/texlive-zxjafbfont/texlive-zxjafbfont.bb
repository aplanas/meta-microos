SUMMARY = "Fallback CJK font support for xeCJK"
DESCRIPTION = "The zxjafbfont package"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn28539"

RPM_NAME = "texlive-zxjafbfont-2023.209.0.0.2svn28539-53.2.noarch.rpm"
RPM_HASH = "f3523229c0866fd42764690ae748b1536c37b25b02e7315c3bb5dd9c50fd8abf2c010eadeaaae01688fea8be7cefd3481714eac93fa9139f76df56946fb4f923"
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
