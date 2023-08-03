SUMMARY = "LaTeX template for dissertations in Peking University"
DESCRIPTION = "The package provides a simple, clear and flexible LaTeX \
template for dissertations in Peking University."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.3svn64869"

RPM_NAME = "texlive-pkuthss-2023.209.1.9.3svn64869-52.1.noarch.rpm"
RPM_HASH = "bb4fffed204e92f7f149d4bbdf01279015fb61c8fe6f57bc2a464a0df8cbc07b087849c45f43bdb8fdc3a193035e8af8e1753c039afa30d31434f9c564936fab"
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
