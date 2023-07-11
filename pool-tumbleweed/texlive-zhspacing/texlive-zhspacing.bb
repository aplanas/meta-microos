SUMMARY = "Spacing for mixed CJK-English documents in XeTeX"
DESCRIPTION = "The package manages spacing in a CJK document; between \
consecutive Chinese letters, spaces are ignored, but a \
consistent space is inserted between Chinese text and English \
(or mathematics). The package may be used by any document \
format under XeTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn41145"

RPM_NAME = "texlive-zhspacing-2023.201.svn41145-52.2.noarch.rpm"
RPM_HASH = "c88fa05b501959495c8f8b0f4ec57de8deac6127d62822e0c49ae2c19094608c667fef2034a45b207f6891f9c4521062635e96a5b6120062a50d72348949fb6f"
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
