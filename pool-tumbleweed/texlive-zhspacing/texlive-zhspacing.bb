SUMMARY = "Spacing for mixed CJK-English documents in XeTeX"
DESCRIPTION = "The package manages spacing in a CJK document; between \
consecutive Chinese letters, spaces are ignored, but a \
consistent space is inserted between Chinese text and English \
(or mathematics). The package may be used by any document \
format under XeTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn41145"

RPM_NAME = "texlive-zhspacing-2023.201.svn41145-52.1.noarch.rpm"
RPM_HASH = "68d7137b8f03a0a3de98429d3229a547b6556d13ac1c739b1311804d2b02b730bb929ef36e1bf59ebf46dceadaf32cfea693a38869b83f916f10fb79a27fef71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(t-zhspacing.tex) \
tex(zhfont.sty) \
tex(zhmath.sty) \
tex(zhsmyclass.sty) \
tex(zhspacing.sty) \
tex(zhsusefulmacros.sty) \
tex(zhulem.sty) \
texlive-zhspacing"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontspec.sty) \
tex(ulem.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
