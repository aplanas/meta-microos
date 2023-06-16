SUMMARY = "LaTeX template for dissertations in Peking University"
DESCRIPTION = "The package provides a simple, clear and flexible LaTeX \
template for dissertations in Peking University."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9.3svn64869"

RPM_NAME = "texlive-pkuthss-2023.201.1.9.3svn64869-51.1.noarch.rpm"
RPM_HASH = "9d5adb06aa7a1c7eed7f0e6d1c14c62f7ebaa09a7a57dfc51012fdcadd056417f183c47b114f997da6952b5d579d9692921346e1ef9756a4628d22dc8921e26b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pkuthss-gbk.def \
tex-pkuthss-utf8.def \
tex-pkuthss.cls \
tex-pkuthss.def \
texlive-pkuthss"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-caption.sty \
tex-ctexbook.cls \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-keyval.sty \
tex-latexsym.sty \
tex-mathptmx.sty \
tex-scrextend.sty \
tex-setspace.sty \
tex-subcaption.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-tocloft.sty \
tex-ulem.sty \
tex-unicode-math.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
