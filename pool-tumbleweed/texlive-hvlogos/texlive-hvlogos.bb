SUMMARY = "Print TeX-related names as logo"
DESCRIPTION = "This package is more or less an extension to Heiko Oberdiek's \
package hologo. It prints TeX-related names as logos. The \
package requires fetamont, hologo, dantelogo, and xspace."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.09svn63261"

RPM_NAME = "texlive-hvlogos-2023.208.0.0.09svn63261-53.1.noarch.rpm"
RPM_HASH = "5633963048e1c81737bd3f3df6c23d2134540a367e6e9d3834c251100bff146ff4c3099536378bc2828a828752dc477fe05c6038a9fe4679505e29e0bd118d32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hvlogos.sty \
texlive-hvlogos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-dantelogo.sty \
tex-expl3.sty \
tex-fetamont.sty \
tex-hologo.sty \
tex-unicode-math.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
