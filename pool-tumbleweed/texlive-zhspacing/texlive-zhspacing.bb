SUMMARY = "Spacing for mixed CJK-English documents in XeTeX"
DESCRIPTION = "The package manages spacing in a CJK document; between \
consecutive Chinese letters, spaces are ignored, but a \
consistent space is inserted between Chinese text and English \
(or mathematics). The package may be used by any document \
format under XeTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn41145"

RPM_NAME = "texlive-zhspacing-2023.209.svn41145-53.2.noarch.rpm"
RPM_HASH = "71e453c55bbd846a1667706518253dffa4440957ffbb9404d8cd2db2b4dcb791650449832212ea822fb7dfe504f87eef11fc6e43df9257de59db94068e8f6373"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-zhspacing.tex \
tex-zhfont.sty \
tex-zhmath.sty \
tex-zhsmyclass.sty \
tex-zhspacing.sty \
tex-zhsusefulmacros.sty \
tex-zhulem.sty \
texlive-zhspacing"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
