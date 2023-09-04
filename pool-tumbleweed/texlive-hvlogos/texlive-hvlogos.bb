SUMMARY = "Print TeX-related names as logo"
DESCRIPTION = "This package is more or less an extension to Heiko Oberdiek's \
package hologo. It prints TeX-related names as logos. The \
package requires fetamont, hologo, dantelogo, and xspace."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.09svn63261"

RPM_NAME = "texlive-hvlogos-2023.209.0.0.09svn63261-54.1.noarch.rpm"
RPM_HASH = "2be800492c9099de48d0c9ebbda1bbcda3d220c3cd76de51eb9b2128837472f77847de1c1c2c0dafa65484ea1a8141f53e830155564f80d4b731a211479213ec"
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
