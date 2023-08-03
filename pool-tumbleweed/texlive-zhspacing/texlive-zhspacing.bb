SUMMARY = "Spacing for mixed CJK-English documents in XeTeX"
DESCRIPTION = "The package manages spacing in a CJK document; between \
consecutive Chinese letters, spaces are ignored, but a \
consistent space is inserted between Chinese text and English \
(or mathematics). The package may be used by any document \
format under XeTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn41145"

RPM_NAME = "texlive-zhspacing-2023.209.svn41145-53.1.noarch.rpm"
RPM_HASH = "e0fe3834cdc38c0a8b450b21c4d8af97b71620d73452d3092d2b76cb082f204ebb8b33a1308d2aefe0e2fce6b40d67c83f4d37de56c8c71a911341b72f10ec77"
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
